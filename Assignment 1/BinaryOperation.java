//BinaryOperations represents operations that take two operands
//TAObject operand1,operan2: representing the two operands
//each class has different constructors depending on the type of passed object
//instead of having a constructor that take TAObject as parameter, divide funcionalities
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TABool && operand2 instanceof TABool)
		{
			TABool op1 = (TABool)operand1;
			TABool op2 = (TABool)operand2;
			result = new TABool((!op1.getValue()) || op2.getValue());
			
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool((!temp1.getValue()) || temp2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TABool)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool((!temp1.getValue()) || op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TABool)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool((!temp1.getValue()) || op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool((!temp1.getValue()) || temp2.getValue());
			}
			
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool((!temp1.getValue()) || temp2.getValue());
			}
		}
	}
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "Implies";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TABool && operand2 instanceof TABool)
		{
			TABool op1 = (TABool)operand1;
			TABool op2 = (TABool)operand2;
			result = new TABool(op1.getValue() && op2.getValue());
			
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() && temp2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TABool)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() && op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TABool)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() && op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() && temp2.getValue());
			}
			
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() && temp2.getValue());
			}
		}
	}
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "And";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TABool && operand2 instanceof TABool)
		{
			TABool op1 = (TABool)operand1;
			TABool op2 = (TABool)operand2;
			result = new TABool(op1.getValue() ^ op2.getValue());
			
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() ^ temp2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TABool)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() ^ op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TABool)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() ^ op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() ^ temp2.getValue());
			}
			
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() ^ temp2.getValue());
			}
		}
	}
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "Xor";
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
		}
		else
		{
			System.out.print(this.getName());
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
			result = new TABool(temp1.getValue() || temp2.getValue());
		}
	}
	public void evaluate()
	{
		if(operand1 instanceof TABool && operand2 instanceof TABool)
		{
			TABool op1 = (TABool)operand1;
			TABool op2 = (TABool)operand2;
			result = new TABool(op1.getValue() || op2.getValue());
			
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() || temp2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TABool)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() || op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TABool)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() || op2.getValue());
				
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() || temp2.getValue());
			}
			
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() || temp2.getValue());
			}
		}
	}
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "Or";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TAInt(op1.getValue() + op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op1 = (TADouble)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TADouble(op1.getValue() + op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAInt)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()+op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TADouble)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()+op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAInt)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()+op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TADouble)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()+op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
	public String type()
	{
		return "Add";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TAInt(op1.getValue() - op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op1 = (TADouble)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TADouble(op1.getValue() - op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAInt)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()-op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TADouble)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()-op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAInt)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()-op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TADouble)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()-op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
	public String type()
	{
		return "Subtract";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TAInt(op1.getValue() * op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op1 = (TADouble)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TADouble(op1.getValue() * op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAInt)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()*op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TADouble)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()*op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAInt)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()*op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TADouble)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()*op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
	public String type()
	{
		return "Multiply";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TAInt(op1.getValue() / op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op1 = (TADouble)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TADouble(op1.getValue() / op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAInt)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TADouble)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAInt)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TADouble)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		if(result instanceof TAInt)
		{
			TAInt temp = (TAInt)result;
			System.out.println(temp.getValue());
		}
		else if(result instanceof TADouble)
		{
			TADouble temp = (TADouble)result;
			System.out.println(temp.getValue());
		}
	}
	public String type()
	{
		return "Divide";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TABool(op1.getValue() > op2.getValue());
		}
		else if(operand1 instanceof TAInt && operand2 instanceof TADouble)
		{
			TAInt op1 = (TAInt)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TABool(op1.getValue() > op2.getValue());
		}
		else if(operand2 instanceof TAInt && operand1 instanceof TADouble)
		{
			TAInt op2 = (TAInt)operand2;
			TADouble op1 = (TADouble)operand1;
			result = new TABool(op1.getValue() > op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op2 = (TADouble)operand2;
			TADouble op1 = (TADouble)operand1;
			result = new TABool(op1.getValue() > op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			UnaryOperation op2 = (UnaryOperation)operand1;
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
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			BinaryOperation op2 = (BinaryOperation)operand1;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "MoreThan";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TABool(op1.getValue() < op2.getValue());
		}
		else if(operand1 instanceof TAInt && operand2 instanceof TADouble)
		{
			TAInt op1 = (TAInt)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TABool(op1.getValue() < op2.getValue());
		}
		else if(operand2 instanceof TAInt && operand1 instanceof TADouble)
		{
			TAInt op2 = (TAInt)operand2;
			TADouble op1 = (TADouble)operand1;
			result = new TABool(op1.getValue() < op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op2 = (TADouble)operand2;
			TADouble op1 = (TADouble)operand1;
			result = new TABool(op1.getValue() < op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			UnaryOperation op2 = (UnaryOperation)operand1;
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
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			BinaryOperation op2 = (BinaryOperation)operand1;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "LessThan";
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
		}
		else
		{
			System.out.print(this.getName());
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
	public void evaluate()
	{
		if(operand1 instanceof TAInt && operand2 instanceof TAInt)
		{
			TAInt op1 = (TAInt)operand1;
			TAInt op2 = (TAInt)operand2;
			result = new TABool(op1.getValue() == op2.getValue());
		}
		else if(operand1 instanceof TAInt && operand2 instanceof TADouble)
		{
			TAInt op1 = (TAInt)operand1;
			TADouble op2 = (TADouble)operand2;
			result = new TABool(op1.getValue() == op2.getValue());
		}
		else if(operand2 instanceof TAInt && operand1 instanceof TADouble)
		{
			TAInt op2 = (TAInt)operand2;
			TADouble op1 = (TADouble)operand1;
			result = new TABool(op1.getValue() == op2.getValue());
		}
		else if(operand1 instanceof TADouble && operand2 instanceof TADouble)
		{
			TADouble op2 = (TADouble)operand2;
			TADouble op1 = (TADouble)operand1;
			result = new TABool(op1.getValue() == op2.getValue());
		}
		else if(operand1 instanceof UnaryOperation && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			UnaryOperation op2 = (UnaryOperation)operand1;
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
		else if(operand1 instanceof UnaryOperation && operand2 instanceof UnaryOperation)
		{
			UnaryOperation op1 = (UnaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof UnaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			UnaryOperation op2 = (UnaryOperation)operand2;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			BinaryOperation op2 = (BinaryOperation)operand1;
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
		else if(operand1 instanceof BinaryOperation && operand2 instanceof BinaryOperation)
		{
			BinaryOperation op1 = (BinaryOperation)operand1;
			BinaryOperation op2 = (BinaryOperation)operand2;
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
	public void printState()
	{
		TABool temp = (TABool)result;
		System.out.println(temp.getValue());
	}
	public String type()
	{
		return "Equals";
	}
}