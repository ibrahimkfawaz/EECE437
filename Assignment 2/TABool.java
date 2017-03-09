public class TABool extends TAPrimitiveType
{
	private boolean value;
	public String type()
	{
		return "Boolean";
	}
	//default value: true
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
	//list name
	public void list()
	{
		System.out.print(this.getName());
	}
}
