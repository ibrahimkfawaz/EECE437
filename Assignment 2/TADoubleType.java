public class TADoubleType extends TAType
{
	private static final TADoubleType instance = new TADoubleType();
	public String getType()
	{
		return "double";
	}
	
	public static TADoubleType getInstance()
	{
		return instance;
	}
}