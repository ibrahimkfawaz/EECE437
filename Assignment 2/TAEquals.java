
public class TAEquals extends TABinaryFormulae
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
