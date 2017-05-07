#include "TABoolBinaryOp.h"

struct TALessThanEq : public TABoolBinaryOp {
  TALessThanEq(TATerm & op1, TATerm & op2) : 
    TABoolBinaryOp(op1,op2) 
  {
  }

  virtual TAValue & evaluateExecute(TAValue & val1, TAValue & val2) {
    val.assignLessThanEq(val1,val2);
    return val;
  }

  virtual const string operatorSign () const {
    return "<=";
  }
};
