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
}