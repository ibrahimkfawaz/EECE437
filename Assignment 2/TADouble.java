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

