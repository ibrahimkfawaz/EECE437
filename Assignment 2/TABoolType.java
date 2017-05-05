public class TABoolType extends TAType
{
	private static final TABoolType instance = new TABoolType();
	public String getType()
	{
		return "bool";
	}
	
	public static TABoolType getInstance()
	{
		return instance;
	}
}