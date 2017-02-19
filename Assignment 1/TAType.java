public abstract class TAType extends TAObject
{
	
}

class TABool extends TAType
{
	private boolean value;
	public String type()
	{
		return "Boolean";
	}
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
	public void list()
	{
		System.out.print(this.getName());
	}
}

class TADouble extends TAType
{
	private double value;
	public String type()
	{
		return "Double";
	}
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
	public void list()
	{
		System.out.print(this.getName());
	}
}

class TAInt extends TAType
{
	private int value;
	public String type()
	{
		return "Integer";
	}
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
	public void list()
	{
		System.out.print(this.getName());
	}
}