#pragma once
#include "TAAtomicStmt.h"
#include "TATerm.h"

struct TAAssignment : public TAAtomicStmt
{
	TATerm & target;
	TATerm & expression;

	TAAssignment(TATerm & t,TATerm & e) : target(t), expression(e)
	{
		//TODO: check types, see if they match else throw exception
	}

	virtual void evaluate()
	{
		TAValue & temp =  expression.evaluate();
		target.val  = temp;
	}

	virtual void list(ostream &os)
	{
		os << "( ";
		expression.list(os);
		os << " is assigned to ";
		target.list(os);
		os << " )" <<endl;

	}

	virtual const TAType & getType() const {
    // this is a formula, it returns a boolean type
    return TAType::getTypeInstance(TA_BOOL);
  };
};
