#pragma once
#include "TATerm.h"
#include "TADomain.h"
struct TAForAll : public TATerm
{
	TATerm & formula;
	TADomain & domain;

	TAForAll(TATerm &f, TAType &d) : 
		formula(f), domain(d)
	{
	}

	virtual TAValue & evaluate()
	{
		
	}

	virtual void list(ostream & os)
	{

	}
};
