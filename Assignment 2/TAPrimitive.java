//Primitive types: Integer, Double, Boolean, Pair, and Array
public abstract class TAPrimitive extends TAElement
{
	protected String name;
	//get the name
	public String getName() 
	{
		return this.name;
	}
	//set the name
	public void setName(String n)
	{
		name = n;
	}
	public abstract void list();
}

public class TAInt extends TAPrimitive
{
	private TAIntValue value;
	public TAInt(int i)
	{
		this.value.setValue(i);
	}
	public void set(int i)
	{
		this.value.setValue(i);
	}
	//constructor for passed string
	public TAInt(String name)
	{
		this.setName(name);
	}
	//implementing list
	public void list()
	{
		System.out.print(this.getName());
	}
	public TAIntValue getValue()
	{
		return this.value;
	}
	public void setValue(TAIntValue v)
	{
		this.value = v;
	}
}

public class TADouble extends TAPrimitive
{
	private TADoubleValue value;
	public TADouble(double d)
	{
		this.value.setValue(d);
	}
	public void set(double d)
	{
		this.value.setValue(d);
	}
	//constructor for passed string
	public TADouble(String name)
	{
		this.setName(name);
	}
	//implementing list
	public void list()
	{
		System.out.print(this.getName());
	}
	public TADoubleValue getValue()
	{
		return this.value;
	}
	public void setValue(TADoubleValue v)
	{
		this.value = v;
	}
}

public class TABool extends TAPrimitive
{
	private TABoolValue value;
	public TABool(bool b)
	{
		this.value.setValue(b);
	}
	public void set(bool b)
	{
		this.value.setValue(b);
	}
	//constructor for passed string
	public TABool(String name)
	{
		this.setName(name);
	}
	//implementing list
	public void list()
	{
		System.out.print(this.getName());
	}
	public TABoolValue getValue()
	{
		return this.value;
	}
	public void setValue(TABoolValue v)
	{
		this.value = v;
	}
}

public class TAPair extends TAPrimitive
{
	private TAPairValue value;

}

public class TAArray extends TAPrimitive
{
	private TAArrayValue
}