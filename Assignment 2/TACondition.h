#pragma once
#include "TAAtomicStmt.h"
#include "TATerm.h"
#include "TAAssignment.h"

struct TACondition : public TAAtomicStmt
{
	TATerm & e;
	TAStmt & s1;
	TAStmt & s2;

	TACondition(TATerm & e,TAStmt & s1,TAStmt & s2) : e(e), s1(s1),s2(s2)
	{
	}

	virtual void evaluate()
	{
		TAValue & temp =  e.evaluate();
		if(e.getValue().getBool())
			s1.evaluate();
		else
			s2.evaluate();
	}

	virtual void list(ostream &os)
	{
		os << "( if ";
		e.list(os);
		os << " then ";
		s1.list(os);
		os << "		else ";
		s2.list(os);
		os << " )" <<endl;

	}

	    virtual const TAType & getType() const {
    // this is a formula, it returns a boolean type
    return TAType::getTypeInstance(TA_BOOL);
  };
};
