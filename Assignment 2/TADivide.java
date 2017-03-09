
public class TADivide extends TABinaryTerm
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

