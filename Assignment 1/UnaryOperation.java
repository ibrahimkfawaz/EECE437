/*
 * add exceptions for type mismatching
 */
public abstract class UnaryOperation extends TAObject
{
	public TAType result;
	
}

class TANot extends UnaryOperation
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "NOT ");
			operand.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TANot(String val)
	{
		super.setName(val);
	}
	public TANot(TABool val)
	{
		operand = val;
		result = new TABool(!(val.getValue()));
	}
	public TANot(UnaryOperation val)
	{
		operand = val;
		if(val.result instanceof TABool)
		{
			TABool temp = (TABool) val.result;
			result = new TABool(!(temp.getValue()));
		}
	}
	public TANot(BinaryOperation val)
	{
		operand = val;
		if(val.result instanceof TABool)
		{
			TABool temp = (TABool) val.result;
			result = new TABool(!(temp.getValue()));
		}
	}
	public void evaluate()
	{
		if(operand instanceof TABool)
		{
			TABool temp = (TABool)operand;
			result = new TABool(!(temp.getValue()));
		}
		else if(operand instanceof UnaryOperation)
		{
			UnaryOperation temp = (UnaryOperation)operand;
			if(temp.result instanceof TABool)
			{
				TABool temp1 = (TABool) temp.result;
				result = new TABool(!(temp1.getValue()));
			}
			
		}
		else if(operand instanceof BinaryOperation)
		{
			BinaryOperation temp = (BinaryOperation)operand;
			if(temp.result instanceof TABool)
			{
				TABool temp1 = (TABool) temp.result;
				result = new TABool(!(temp1.getValue()));
			}
			
		}
	}
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
}

class TAUnaryMinus extends UnaryOperation
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Minus ");
			operand.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAUnaryMinus(TAInt val)
	{
		operand = val;
		result = new TAInt(val.getValue()*-1);
	}
	public TAUnaryMinus(TADouble val)
	{
		operand = val;
		result = new TADouble(val.getValue()*-1);
	}
	public TAUnaryMinus(String val)
	{
		super.setName(val);
	}
	public TAUnaryMinus(UnaryOperation val)
	{
		operand = val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(temp.getValue());
		}
	}
	public TAUnaryMinus(BinaryOperation val)
	{
		operand = val;
		if(val.result instanceof TAInt)
		{	
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(temp.getValue());
		}
	}
	public void evaluate()
	{
		if(operand instanceof TAInt)
		{
			TAInt temp = (TAInt)operand;
			result = new TAInt(temp.getValue()*-1);
		}
		else if(operand instanceof TADouble)
		{
			TADouble temp = (TADouble)operand;
			result = new TADouble(temp.getValue()*-1);
		}
		else if(operand instanceof UnaryOperation)
		{
			UnaryOperation temp = (UnaryOperation)operand;
			if(temp.result instanceof TAInt)
			{
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue()*-1);
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(temp1.getValue()*-1);
			}
			
		}
		else if(operand instanceof BinaryOperation)
		{
			
			BinaryOperation temp = (BinaryOperation)operand;
			if(temp.result instanceof TAInt)
			{	
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue()*-1);
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(temp1.getValue()*-1);
			}
		}
	}
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
}

class TACeiling extends UnaryOperation
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Ceiling ");
			operand.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TACeiling(TADouble val)
	{
		operand = val;
		result = new TADouble(Math.ceil(val.getValue()));
	}
	public TACeiling(TAInt val)
	{
		operand = val;
		result = new TAInt(val.getValue());
	}
	public TACeiling(String a)
	{
		super.setName(a);
	}
	public TACeiling(UnaryOperation val)
	{
		operand=val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(Math.ceil(temp.getValue()));
		}
	}
	public TACeiling(BinaryOperation val)
	{
		operand = val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(Math.ceil(temp.getValue()));
		}
	}
	public void evaluate()
	{
		if(operand instanceof TAInt)
		{
			TAInt temp = (TAInt)operand;
			result = new TAInt(temp.getValue());
		}
		else if(operand instanceof TADouble)
		{
			TADouble temp = (TADouble)operand;
			result = new TADouble(Math.ceil(temp.getValue()));
		}
		else if(operand instanceof UnaryOperation)
		{
			UnaryOperation temp = (UnaryOperation)operand;
			if(temp.result instanceof TAInt)
			{
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue());
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(Math.ceil(temp1.getValue()));
			}
			
		}
		else if(operand instanceof BinaryOperation)
		{
			
			BinaryOperation temp = (BinaryOperation)operand;
			if(temp.result instanceof TAInt)
			{	
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue());
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(Math.ceil(temp1.getValue()));
			}
		}
	}
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
}

class TAFloor extends UnaryOperation
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Floor ");
			operand.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAFloor(TADouble val)
	{
		operand = val;
		result = new TADouble(Math.floor(val.getValue()));
	}
	public TAFloor(TAInt val)
	{
		operand = val;
		result = new TAInt(val.getValue());
	}
	public TAFloor(String val)
	{
		super.setName(val);
	}
	public TAFloor(UnaryOperation val)
	{
		operand = val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(Math.floor(temp.getValue()));
		}
	}
	public TAFloor(BinaryOperation val)
	{
		operand = val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(Math.floor(temp.getValue()));
		}
	}
	public void evaluate()
	{
		if(operand instanceof TAInt)
		{
			TAInt temp = (TAInt)operand;
			result = new TAInt(temp.getValue());
		}
		else if(operand instanceof TADouble)
		{
			TADouble temp = (TADouble)operand;
			result = new TADouble(Math.floor(temp.getValue()));
		}
		else if(operand instanceof UnaryOperation)
		{
			UnaryOperation temp = (UnaryOperation)operand;
			if(temp.result instanceof TAInt)
			{
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue());
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(Math.floor(temp1.getValue()));
			}
			
		}
		else if(operand instanceof BinaryOperation)
		{
			
			BinaryOperation temp = (BinaryOperation)operand;
			if(temp.result instanceof TAInt)
			{	
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue());
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(Math.floor(temp1.getValue()));
			}
		}
	}
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
}
