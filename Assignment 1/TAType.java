public abstract class TAType
{

}

class TABool extends TAType
{
	private boolean value;
	public TABool()
	{
		value=true;
	}
	public TABool(boolean value)
	{
		this.value=value;
	}
	public boolean getValue()
	{
		return value;
	}
}

class TADouble extends TAType
{
	private double value;
	public TADouble()
	{
		value=0;
	}
	public TADouble(double value)
	{
		this.value=value;
	}
	public double getValue()
	{
		return value;
	}
}

class TAInt extends TAType
{
	private int value;
	public TAInt()
	{
		value=0;
	}
	public TAInt(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
}