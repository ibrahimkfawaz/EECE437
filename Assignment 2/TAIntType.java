
public class TAIntType extends TAType
{
	private static final TAIntType instance = new TAIntType();
	public String getType()
	{
		return "int";
	}
	
	public static TAIntType getInstance()
	{
		return instance;
	}
}