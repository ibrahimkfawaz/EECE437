#pragma once
#include "TAObj.h"
#include "TAType.h"

struct TADomain : public TAObj
{
	TAType & domainType;
	bool finite; //if true, this is a finite domain
	TAValue *values;
	int size;

	TADomain(TAType &d) : domainType(d)
	{
		finite=false;
	}

	void setDomain(TADouble p[],int s)
	{
		size=s;
		finite=true;
		values = new TADoubleValue[size];
		for (int i = 0; i < size; ++i)
		{
			values[i] = new TADoubleValue(p[i].evaluate().getDouble())
		}
	}

	void setDomain(TAInt p[],int s)
	{	
		size=s;
		finite=true;
		values = new TAIntValue[size];
		for (int i = 0; i < size; ++i)
		{
			values[i] = new TAIntValue(p[i].evaluate().getInt())
		}
	}

	void setDomain(TABool b)
	{
		size=1;
		values = new TABoolValue[1];
		values[0] = new TABoolValue(b.evaluate().getBool());
	}

	TAType & getType()
	{
		return domainType;
	}



};