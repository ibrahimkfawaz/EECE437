public class Test
{
	public static void Main(String []args)
	{
		TAInt x = new TAInt(9);
		TADouble d = new TADouble(5.6);
		TADouble dd = new TADouble(2.73);
		TACeiling y = new TACeiling(d);
		TABool b = new TABool(True);
		TALessThan ta = new TALessThan(d,dd);
	}
}

