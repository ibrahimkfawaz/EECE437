public class Test
{
	public static void main(String []args)
	{
		TAInt x = new TAInt(7);
		TADouble d = new TADouble(2.3);
		TADouble d1 = new TADouble(4.7);
		
		d.setName("d");
		TACeiling y = new TACeiling(d); // denotes y is the ceiling of d
		TABool b = new TABool();
		TALessThan t1 = new TALessThan(x,y); // denotes x < y
		y.list();
		System.out.println();
		t1.list();
		System.out.println();
		TAAnd t2 = new TAAnd(t1,b); // denotes b and t1
		b.setName("b"); //change name of b
		t2.list(); //list of AND operatir t2
		System.out.println();
		b.set(true); //change value of b
		TANot t3 = new TANot(b); //new NOT operator
	
		t3.printState();
		b.set(false); //change valye of b
		y.evaluate(); //evaluate after changing value of b
		t3.evaluate();
		t3.printState(); //state changes
		System.out.println();
		TALessThan tt = new TALessThan(d,d1);
		tt.printState();
		d.set(5.0); //change value of
		tt.evaluate(); //evaluate after change
		tt.printState(); //state changes
	}
}

