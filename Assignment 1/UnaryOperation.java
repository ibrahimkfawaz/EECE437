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
	public TANot(String a)
	{
		super.setName(a);
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
	public TAUnaryMinus(String a)
	{
		super.setName(a);
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
	public TAFloor(String a)
	{
		super.setName(a);
	}
}
