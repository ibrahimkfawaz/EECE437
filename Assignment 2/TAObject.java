//Root class: all classes derive from it
public abstract class TAObject
{
	//all objects have a name field, default value of "" to avoid having a null value
	private String name="";
	abstract void list();
	//setters and getters for the name member
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}
