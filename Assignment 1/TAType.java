public abstract class TAType extends TAObject
{
	public void list()
	{
		System.out.print(this.getName());
	}
}

class TABool extends TAType
{
	private boolean value;
	public TABool()
	{
		value=true;
	}
	public void set(boolean val)
	{
		value=val;
	}
	public TABool(String a)
	{
		super.setName(a);
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
	public void set(double val)
	{
		value=val;
	}
	public TADouble(double value)
	{
		this.value=value;
	}
	public double getValue()
	{
		return value;
	}
	public TADouble(String a)
	{
		super.setName(a);
	}
}

class TAInt extends TAType
{
	private int value;
	public TAInt()
	{
		value=0;
	}
	public void set(int val)
	{
		value = val;
	}
	public TAInt(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
	public TAInt(String a)
	{
		super.setName(a);
	}
}