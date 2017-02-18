public class Test
{
	public static void main(String []args)
	{
		TAInt x = new TAInt(7);
		TADouble d = new TADouble(2.3);
		TACeiling y = new TACeiling(d); //y is ceiling of d, y=3
		TABool b = new TABool(); //default constructor, value is true
		TALessThan t1 = new TALessThan(x,y); // 7<3, gives false
		TAAnd t2 = new TAAnd(t1,b); //true AND false = false
		TABool temp = (TABool)t2.result;
		System.out.println(temp.getValue()); //prints the value, false
	}
}