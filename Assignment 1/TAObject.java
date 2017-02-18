
public abstract class TAObject
{
	private String name;
	abstract void list();
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}
