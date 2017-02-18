/*
 * add exceptions for type mismatching
 */
public abstract class BinaryOperation extends TAObject
{
	public TAType result;
}

class TAImplies extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Implies ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAImplies(TABool op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool((!op1.getValue()) || op2.getValue());
	}
	public TAImplies(String a)
	{
		super.setName(a);
	}
	
	public TAImplies(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool((!temp1.getValue()) || temp2.getValue());
		}
	}
	public TAImplies(UnaryOperation op1, TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool((!temp1.getValue()) || op2.getValue());
			
		}
	}
	public TAImplies(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool((!temp1.getValue()) || temp2.getValue());
		}
	}
	public TAImplies(BinaryOperation op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool((!temp1.getValue()) || op2.getValue());
			
		}
	}
	public TAImplies(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool((!temp1.getValue()) || temp2.getValue());
		}
	}
}

class TAAnd extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "AND ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAAnd(TABool op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() && op2.getValue());
	}
	public TAAnd(String a)
	{
		super.setName(a);
	}
	public TAAnd(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() && temp2.getValue());
		}
	}
	public TAAnd(UnaryOperation op1, TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() && op2.getValue());
			
		}
	}
	public TAAnd(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() && temp2.getValue());
		}
	}
	public TAAnd(BinaryOperation op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() && op2.getValue());
			
		}
	}
	public TAAnd(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() && temp2.getValue());
		}
	}
	
}

class TAXor extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "XOR ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAXor(TABool op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() ^ op2.getValue());
	}
	public TAXor(String a)
	{
		super.setName(a);
	}
	public TAXor(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() ^ temp2.getValue());
		}
	}
	public TAXor(UnaryOperation op1, TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() ^ op2.getValue());
			
		}
	}
	public TAXor(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() ^ temp2.getValue());
		}
	}
	public TAXor(BinaryOperation op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() ^ op2.getValue());
			
		}
	}
	public TAXor(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() ^ temp2.getValue());
		}
	}
	
}

class TAOr extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "OR ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAOr(TABool op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() || op2.getValue());
	}
	public TAOr(String a)
	{
		super.setName(a);
	}
	public TAOr(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() || temp2.getValue());
		}
	}
	public TAOr(UnaryOperation op1, TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() || op2.getValue());
			
		}
	}
	public TAOr(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() || temp2.getValue());
		}
	}
	public TAOr(BinaryOperation op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() || op2.getValue());
			
		}
	}
	public TAOr(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2.result instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			TABool temp2 = (TABool)op2.result;
			result = new TABool(temp1.getValue() ^ temp2.getValue());
		}
	}
}

class TAAdd extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Add ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAAdd(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TAInt(op1.getValue() + op2.getValue());
	}
	public TAAdd(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TADouble(op1.getValue() + op2.getValue());
	}
	public TAAdd(String a)
	{
		super.setName(a);
	}
	public TAAdd(UnaryOperation op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()+op2.getValue());
		}
	}
	public TAAdd(UnaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()+op2.getValue());
		}
	}
	public TAAdd(UnaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() + temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() + temp2.getValue());
			
		}
	}
	public TAAdd(BinaryOperation op1, TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()+op2.getValue());
		}
	}
	public TAAdd(BinaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()+op2.getValue());
		}
	}
	public TAAdd(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() + temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() + temp2.getValue());
			
		}
	}
}

class TASubtract extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Subtract ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TASubtract(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TAInt(op1.getValue() - op2.getValue());
	}

	public TASubtract(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TADouble(op1.getValue() - op2.getValue());
	}
	public TASubtract(String a)
	{
		super.setName(a);
	}
	public TASubtract(UnaryOperation op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()-op2.getValue());
		}
	}
	public TASubtract(UnaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()-op2.getValue());
		}
	}
	public TASubtract(UnaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() - temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() - temp2.getValue());
			
		}
	}
	public TASubtract(BinaryOperation op1, TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()-op2.getValue());
		}
	}
	public TASubtract(BinaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()-op2.getValue());
		}
	}
	public TASubtract(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() - temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() - temp2.getValue());
			
		}
	}
}

class TAMultiply extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Multiply ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAMultiply(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TAInt(op1.getValue() * op2.getValue());
	}
	public TAMultiply(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TADouble(op1.getValue() * op2.getValue());
	}
	public TAMultiply(String a)
	{
		super.setName(a);
	}
	public TAMultiply(UnaryOperation op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()*op2.getValue());
		}
	}
	public TAMultiply(UnaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()*op2.getValue());
		}
	}
	public TAMultiply(UnaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() * temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() * temp2.getValue());
			
		}
	}
	public TAMultiply(BinaryOperation op1, TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()*op2.getValue());
		}
	}
	public TAMultiply(BinaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()*op2.getValue());
		}
	}
	public TAMultiply(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() * temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() * temp2.getValue());
			
		}
	}
}

class TADivide extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Divide ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TADivide(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TADouble(op1.getValue() / op2.getValue());
	}

	public TADivide(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TADouble(op1.getValue() / op2.getValue());
	}
	public TADivide(String a)
	{
		super.setName(a);
	}
	public TADivide(UnaryOperation op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(UnaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(UnaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() / temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() / temp2.getValue());
			
		}
	}
	public TADivide(BinaryOperation op1, TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(BinaryOperation op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TAInt(temp1.getValue() / temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TADouble(temp1.getValue() / temp2.getValue());
			
		}
	}
}

class TAMoreThan extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "More Than ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAMoreThan(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() > op2.getValue());
	}

	public TAMoreThan(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() > op2.getValue());
	}
	public TAMoreThan(TADouble op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() > op2.getValue());
	}
	public TAMoreThan(TAInt op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() > op2.getValue());
	}
	public TAMoreThan(String a)
	{
		super.setName(a);
	}
	public TAMoreThan(TAType op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1 instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if (op1 instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1 instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1 instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
	}
	public TAMoreThan(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
	}
	public TAMoreThan(TAType op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1 instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if (op1 instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1 instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1 instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
	}
	public TAMoreThan(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
	}
	public TAMoreThan(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() > temp2.getValue());
		}
	}
	
}

class TALessThan extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Less Than ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TALessThan(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() < op2.getValue());
	}

	public TALessThan(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() < op2.getValue());
	}
	public TALessThan(TADouble op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() < op2.getValue());
	}
	public TALessThan(TAInt op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() < op2.getValue());
	}
	public TALessThan(String a)
	{
		super.setName(a);
	}
	public TALessThan(TAType op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1 instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if (op1 instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1 instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1 instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
	}
	public TALessThan(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
	}
	public TALessThan(TAType op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1 instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if (op1 instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1 instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1 instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
	}
	public TALessThan(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
	}
	public TALessThan(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() < temp2.getValue());
		}
	}
	
}

class TAEquals extends BinaryOperation
{
	TAObject operand1;
	TAObject operand2;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Equals ");
			operand1.list();
			System.out.print(" ");
			operand2.list();
			System.out.print(" )");
			System.out.println();
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAEquals(TAInt op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() == op2.getValue());
	}
	public TAEquals(TADouble op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		result = new TABool(op1.getValue() == op2.getValue());
	}
	public TAEquals(String a)
	{
		super.setName(a);
	}
	public TAEquals(TAType op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1 instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if (op1 instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1 instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1 instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
	}
	public TAEquals(UnaryOperation op1, UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
	}
	public TAEquals(TAType op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1 instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if (op1 instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1 instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1 instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
	}
	public TAEquals(BinaryOperation op1,UnaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
	}
	public TAEquals(BinaryOperation op1,BinaryOperation op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt && op2.result instanceof TAInt)
		{
			TAInt temp1 = (TAInt)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if (op1.result instanceof TADouble && op2.result instanceof TADouble)
		{
			TADouble temp1 = (TADouble)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1.result instanceof TAInt && op2.result instanceof TADouble)
		{
			TAInt temp1 = (TAInt)op1.result;
			TADouble temp2 = (TADouble)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
		else if(op1.result instanceof TADouble && op2.result instanceof TAInt)
		{
			TADouble temp1 = (TADouble)op1.result;
			TAInt temp2 = (TAInt)op2.result;
			result = new TABool(temp1.getValue() == temp2.getValue());
		}
	}

}