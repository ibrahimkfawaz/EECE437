#pragma once
#include "TAObj.h"
//statement
struct TAStmt : public TAObj
{
	virtual void list()=0;
	virtual void evaluate()=0;
};

struct TAAtomicStmt : public TAStmt 
{

};

struct 
