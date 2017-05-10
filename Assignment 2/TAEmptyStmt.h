#pragma once
#include "TAStmt.h"

struct TAEmptyStmt : public TAStmt
{

	TAEmptyStmt()
	{
	}

	virtual void evaluate()
	{
	}

	virtual void list(ostream & os)
	{
	
		os<< "Empty Statement" <<endl;
	}

	virtual const TAType & getType() const {
    // this is a formula, it returns a boolean type
    return TAType::getTypeInstance(TA_BOOL);
  };

};
