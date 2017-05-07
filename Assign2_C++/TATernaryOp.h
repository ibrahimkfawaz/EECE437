#pragma once 
#include "TATerm.h"
#include "TAValueBase.h"
#include "TABinaryOp.h"
#include <iostream>

struct TATernaryOp : public TABinaryOp {
  TATerm & operand1;
  TATerm & operand2;
  TATerm & operand3;

  TATernaryOp(TATerm & op1, TATerm & op2,TATerm & op3) :
    operand1(op1), operand2(op2), operand3(op3)
  {
  }

  TATerm & gete1() const {return operand1;}
  TATerm & gete2() const {return operand2;}
  TATerm & gete3() const {return operand3;}

  virtual TAValue & evaluate() {
    TAValue & val1 = gete1().evaluate();
	bool e1value = val1.getValue().getBool();
	if(e1value){
		TAValue & val2 = gete2().evaluate();
		return evaluateExecute(val2);
	}
	else{
		TAValue & val3 = gete2().evaluate();
		return evaluateExecute(val3);
	}
  }

  virtual void list( ostream & os) const {
    os << "(" << " ";
    gete1().list(os);
    os << "?";
    gete2().list(os);
	os << ":";
	gete3().list(os);
    os << ")";
  }

  // virtual const string operatorSign() const =0;

  virtual TAValue & evaluateExecute(TAValue & val) = 0;
};
