public class Test
{
	public static void main(String []args)
	{
		TAInt x = new TAInt(7);
		TADouble d = new TADouble(2.3);
		d.setName("d");
		TACeiling y = new TACeiling(d); // denotes y is the ceiling of d
		TABool b = new TABool();
		TALessThan t1 = new TALessThan(x,y); // denotes x < y
		y.list();
		System.out.println();
		t1.list();
		System.out.println();
		TAAnd t2 = new TAAnd(t1,b); // denotes b and t1
		b.setName("b");
		t2.list();
		System.out.println();
		b.set(true);
		TANot t3 = new TANot(b);
		t3.printState();
		b.set(false);
		t3.evaluate();
		t3.printState();
		b.setName("b");
	}
}

