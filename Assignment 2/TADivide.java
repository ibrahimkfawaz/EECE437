
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
	public TADivide(TAUnaryTerm op1,TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(TAUnaryTerm op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(TAUnaryTerm op1,TAUnaryTerm op2)
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
	public TADivide(TABinaryTerm op1, TAInt op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TAInt)
		{
			TAInt temp = (TAInt)op1.result;
			result = new TAInt(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(TABinaryTerm op1,TADouble op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TADouble)
		{
			TADouble temp = (TADouble)op1.result;
			result = new TADouble(temp.getValue()/op2.getValue());
		}
	}
	public TADivide(TABinaryTerm op1,TABinaryTerm op2)
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
		else if(operand1 instanceof TAUnaryTerm && operand2 instanceof TAInt)
		{
			TAUnaryTerm op1 = (TAUnaryTerm)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof TAUnaryTerm && operand2 instanceof TADouble)
		{
			TAUnaryTerm op1 = (TAUnaryTerm)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof TAUnaryTerm && operand2 instanceof TAUnaryTerm)
		{
			TAUnaryTerm op1 = (TAUnaryTerm)operand1;
			TAUnaryTerm op2 = (TAUnaryTerm)operand2;
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
		else if(operand1 instanceof TABinaryTerm && operand2 instanceof TAInt)
		{
			TABinaryTerm op1 = (TABinaryTerm)operand1;
			TAInt op2 = (TAInt)operand2;
			if(op1.result instanceof TAInt)
			{
				TAInt temp = (TAInt)op1.result;
				result = new TAInt(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof TABinaryTerm && operand2 instanceof TADouble)
		{
			TABinaryTerm op1 = (TABinaryTerm)operand1;
			TADouble op2 = (TADouble)operand2;
			if(op1.result instanceof TADouble)
			{
				TADouble temp = (TADouble)op1.result;
				result = new TADouble(temp.getValue()/op2.getValue());
			}
		}
		else if(operand1 instanceof TABinaryTerm && operand2 instanceof TABinaryTerm)
		{
			TABinaryTerm op1 = (TABinaryTerm)operand1;
			TABinaryTerm op2 = (TABinaryTerm)operand2;
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

