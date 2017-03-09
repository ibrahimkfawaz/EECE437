public class TAInt extends TAPrimitiveType
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
