
public class TAAnd extends TABinaryFormulae
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
	public TAAnd(TABinaryFormulae op1, TABinaryFormulae op2)
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
	public TAAnd(TABinaryFormulae op1, TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() && op2.getValue());
			
		}
	}
	public TAAnd(TABinaryFormulae op1,TAUnaryFormulae op2)
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
	public TAAnd(TAUnaryFormulae op1,TABool op2)
	{
		operand1 = op1;
		operand2 = op2;
		if(op1.result instanceof TABool && op2 instanceof TABool)
		{
			TABool temp1 = (TABool)op1.result;
			result = new TABool(temp1.getValue() && op2.getValue());
			
		}
	}
	public TAAnd(TAUnaryFormulae op1,TAUnaryFormulae op2)
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
		else if(operand1 instanceof TAUnaryFormulae && operand2 instanceof TAUnaryFormulae)
		{
			TAUnaryFormulae op1 = (TAUnaryFormulae)operand1;
			TAUnaryFormulae op2 = (TAUnaryFormulae)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() && temp2.getValue());
			}
		}
		else if(operand1 instanceof TAUnaryFormulae && operand2 instanceof TABool)
		{
			TAUnaryFormulae op1 = (TAUnaryFormulae)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() && op2.getValue());
				
			}
		}
		else if(operand1 instanceof TABinaryFormulae && operand2 instanceof TABool)
		{
			TABinaryFormulae op1 = (TABinaryFormulae)operand1;
			TABool op2 = (TABool)operand2;
			if(op1.result instanceof TABool && op2 instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				result = new TABool(temp1.getValue() && op2.getValue());
				
			}
		}
		else if(operand1 instanceof TABinaryFormulae && operand2 instanceof TAUnaryFormulae)
		{
			TABinaryFormulae op1 = (TABinaryFormulae)operand1;
			TAUnaryFormulae op2 = (TAUnaryFormulae)operand2;
			if(op1.result instanceof TABool && op2.result instanceof TABool)
			{
				TABool temp1 = (TABool)op1.result;
				TABool temp2 = (TABool)op2.result;
				result = new TABool(temp1.getValue() && temp2.getValue());
			}
			
		}
		else if(operand1 instanceof TABinaryFormulae && operand2 instanceof TABinaryFormulae)
		{
			TABinaryFormulae op1 = (TABinaryFormulae)operand1;
			TABinaryFormulae op2 = (TABinaryFormulae)operand2;
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
