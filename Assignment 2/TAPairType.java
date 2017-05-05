
public class TAPairType extends TAType
{
	private TAType baseType1;
	private TAType baseType2;
	private static final TAPairType instance = new TAPairType();
	public static TAPairType getInstance()
	{
		return instance;
	}
	private TAPairType(TAType t1, TAType t2)
	{
		baseType1 = t1;
		baseType2 = t2;
	}
	public String getType()
	{
		String s = "[" + baseType1.getType() + "," + baseType2.getType() + "]";
		return s;
	}
}