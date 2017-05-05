
public class TAArrayType extends TAType
{	
	private TAType baseType; //type of the elements inside the array
	private static final TAArrayType instance = new TAArrayType();
	private TAArrayType(TAType t)
	{
		baseType = t;
	}
	//return string denoting the type
	public String getType()
	{
		return baseType.getType();
	}
	//get the instance 
	public static TAArrayType getInstance()
	{
		return instance;
	}
}