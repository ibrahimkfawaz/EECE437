#pragma once
#include "TAStmt.h"
#include "TAAssignment.h"

struct TAConStmt : public TAStmt
{
	TAAssignment & s;
	TAAssignment & l;

	TAConStmt(TAAtomicStmt & s,TAStmt & l) : s(s), l(l)
	{
	}

	virtual void evaluate()
	{
		s.expression.evaluate();
		l.expression.evaluate();
		s.evaluate();
		l.evaluate();
	}

	virtual void list(ostream &os)
	{
		os << "(  ";
		s.list(os);
		os<<" | ";
		l.list(os);
		os << " )";

	}


	virtual const TAType & getType() const {
    // this is a formula, it returns a boolean type
    return TAType::getTypeInstance(TA_BOOL);
  };

};