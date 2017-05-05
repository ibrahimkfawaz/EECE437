//primitive types, all primitive type classes extend TAType
//following the singelton design pattern in Type objects
public abstract class TAType extends TAObject
{
	public abstract String getType();
}