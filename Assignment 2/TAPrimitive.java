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