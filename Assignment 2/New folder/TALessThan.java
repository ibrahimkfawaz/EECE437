
public class TALessThan extends TABinaryFormulae
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
	public TALessThan(TAType op1,TAUnaryTerm op2)
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
	public TALessThan(TAUnaryTerm op1, TAUnaryTerm op2)
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
	public TALessThan(TAType op1,TABinaryTerm op2)
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
	public TALessThan(TABinaryTerm op1,TAUnaryTerm op2)
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
	public TALessThan(TABinaryTerm op1,TABinaryTerm op2)
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
		else if(operand1 instanceof TAUnaryTerm && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			TAUnaryTerm op2 = (TAUnaryTerm)operand1;
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
		else if(operand1 instanceof TAUnaryTerm && operand2 instanceof TAUnaryTerm)
		{
			TAUnaryTerm op1 = (TAUnaryTerm)operand1;
			TAUnaryTerm op2 = (TAUnaryTerm)operand2;
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
		else if(operand1 instanceof TAUnaryTerm && operand2 instanceof TAUnaryTerm)
		{
			TAUnaryTerm op1 = (TAUnaryTerm)operand1;
			TAUnaryTerm op2 = (TAUnaryTerm) operand2;
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
		else if(operand1 instanceof TABinaryTerm && operand2 instanceof TAType)
		{
			TAType op1 = (TAType)operand2;
			TABinaryTerm op2 = (TABinaryTerm)operand1;
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
		else if(operand1 instanceof TABinaryTerm && operand2 instanceof TABinaryTerm)
		{
			TABinaryTerm op1 = (TABinaryTerm)operand1;
			TABinaryTerm op2 = (TABinaryTerm)operand2;
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
