/*
 * add exceptions for type mismatching
 */
public abstract class UnaryOperation
{
	public TAType result;
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public void list()
	{
		System.out.println(name);
	}
}

class TANot extends UnaryOperation
{
	public TANot(TABool val)
	{
		result = new TABool(!(val.getValue()));
	}
	public TANot(String val)
	{
		super.setName(val);
	}
	public TANot(UnaryOperation val)
	{
		if(val.result instanceof TABool)
		{
			TABool temp = (TABool) val.result;
			result = new TABool(!(temp.getValue()));
		}
	}
	public TANot(BinaryOperation val)
	{
		if(val.result instanceof TABool)
		{
			TABool temp = (TABool) val.result;
			result = new TABool(!(temp.getValue()));
		}
	}

}

class TAUnaryMinus extends UnaryOperation
{
	public TAUnaryMinus(TAInt val)
	{
		result = new TAInt(val.getValue()*-1);
	}
	public TAUnaryMinus(TADouble val)
	{
		result = new TADouble(val.getValue()*-1);
	}
	public TAUnaryMinus(String val)
	{
		super.setName(val);
	}
	public TAUnaryMinus(UnaryOperation val)
	{
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
}

class TACeiling extends UnaryOperation
{
	public TACeiling(TADouble val)
	{
		result = new TADouble(Math.ceil(val.getValue()));
	}
	public TACeiling(TAInt val)
	{
		result = new TAInt(val.getValue());
	}
	public TACeiling(String a)
	{
		super.setName(a);
	}
	public TACeiling(UnaryOperation val)
	{
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
}

class TAFloor extends UnaryOperation
{
	public TAFloor(TADouble val)
	{
		result = new TADouble(Math.floor(val.getValue()));
	}
	public TAFloor(TAInt val)
	{
		result = new TAInt(val.getValue());
	}
	public TAFloor(String val)
	{
		super.setName(val);
	}
	public TAFloor(UnaryOperation val)
	{
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
}
