#pragma once
#include "TAObj.h"
//statement
struct TAStmt : public TAObj
{
	virtual void list(ostream &os)=0;
	virtual void list()
	{
		list(cout);
	}
	virtual void evaluate()=0;
};
