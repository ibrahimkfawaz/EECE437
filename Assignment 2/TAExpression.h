#pragma once
#include "TAObj.h"
#include "TATerm.h"
#include "TAValue"
//an expression is an operation with once constant operand and another that is variable "x"
//for example if we have the statement x<5, then the operation is TALessThan and the constant operand is TAIntValue of value 5
struct TAExpression : public TAObj
{
	TABinaryOp & operation;
	TAValue & operand;

	TAExpression(TABinaryOp & t, TAValue & v) : 
	operation(t), operand(v)
	{
	}

	//check if a term satisfies the expression
	bool check(TATerm & a)
	{
		
	}
};