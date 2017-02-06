public abstract class UnaryOperation
{
	public TAType result;
}

class TANot extends UnaryOperation
{
	public TANot(TABool val)
	{
		result = new TABool(!(val.getValue()));
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
}
