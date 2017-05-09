#pragma once 
#include "TATernaryOp.h"

struct TABoolTernaryOp : public TATernaryOp {

  TABoolTernaryOp(TATerm & op1, TATerm & op2,TATerm & op3) :
    TATernaryOp(op1, op2,op3) 
  {
    val.set(false);
  }

  //virtual const TAType & getType() const {
	//return TAType::getTypeInstance(TA_BOOL);
  //}

};