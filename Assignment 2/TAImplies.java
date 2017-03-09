

public class TAImplies extends TABinaryFormulae
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
