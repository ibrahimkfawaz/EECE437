#pragma once
#include "TAAtomicStmt.h"
#include "TATerm.h"
#include "TAAssignment.h"

struct TALoop : public TAAtomicStmt
{
	TATerm & e;
	TAStmt & s;

	TALoop(TATerm & e,TAStmt & s) : e(e), s(s)
	{
	}

	virtual void evaluate()
	{
		TAValue & temp =  e.evaluate();
		while(e.getValue().getBool())
			s.evaluate();
	}

	virtual void list(ostream &os)
	{
		os << "( while( ";
		e.list(os);
		os << " ) ";
		os<<endl<<"	";
		s.list(os);
		os << " )";

	}


	virtual const TAType & getType() const {
    // this is a formula, it returns a boolean type
    return TAType::getTypeInstance(TA_BOOL);
  };

};
