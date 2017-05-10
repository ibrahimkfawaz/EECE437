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

struct TAAtomicStmt : public TAStmt 
{

};

struct TAAssignment : public TAAtomicStmt
{
	TATerm & target;
	TAExpression & expression;

	TAAssignment(TATerm & t,TAExpression & e) : target(t), expression(e)
	{
		//TODO: check types, see if they match else throw exception
	}

	virtual void evaluate()
	{
		TAValue & temp;
		temp = expression.evaluate();
		target.set(temp);
	}

	virtual void list(ostream &os)
	{
		os << "( ";
		expression.list(os);
		os << " is assigned to ";
		target.list(os);
		os << " )" <<endl;

	}
};

struct TACondition : public TAAtomicStmt
{
	
};

struct TALoop : public TAAtomicStmt
{
	
};

struct TAEmptyStmt : public TAStmt
{
	
};

struct  TASequential : public TAStmt
{
	
};