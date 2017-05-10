#include "TABoolTernaryOp.h"

struct TATernaryFormula: public TABoolTernaryOp {
  TATernaryFormula(TATerm & op1, TATerm & op2,TATerm & op3) : 
    TABoolTernaryOp(op1,op2,op3) 
  {
  }

  virtual TAValue & evaluateExecute(TAValue & val1, TAValue & val2,TAValue val3) {
	 /* if val1 true
		  val2.evaluate;
	  else
	     val1.evaluate;*/
   // val.assignLessThan(val1,val2);
    return val;
  }

 // virtual const string operatorSign () const {
 //   return "<";
 // }
};