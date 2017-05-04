public class TADouble extends TAPrimitiveType
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
