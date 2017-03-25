public class TANot extends TAUnaryFormulae
{

	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "NOT ");
			operand.list();
			System.out.print(" )");
		}
		else
		{
			System.out.print(this.getName());
		}
	}
	public TANot(String val)
	{
		super.setName(val);
	}
	public TANot(TABool val)
	{
		operand = val;
		result = new TABool(!(val.getValue()));
	}
	public TANot(TAUnaryFormulae val)
	{
		operand = val;
		if(val.result instanceof TABool)
		{
			TABool temp = (TABool) val.result;
			result = new TABool(!(temp.getValue()));
		}
	}
	public TANot(TABinaryFormulae val)
	{
		operand = val;
		if(val.result instanceof TABool)
		{
			TABool temp = (TABool) val.result;
			result = new TABool(!(temp.getValue()));
		}
	}
	public void evaluate()
	{
		if(operand instanceof TABool)
		{
			TABool temp = (TABool)operand;
			result = new TABool(!(temp.getValue()));
		}
		else if(operand instanceof TAUnaryFormulae)
		{
			TAUnaryFormulae temp = (TAUnaryFormulae)operand;
			if(temp.result instanceof TABool)
			{
				TABool temp1 = (TABool) temp.result;
				result = new TABool(!(temp1.getValue()));
			}
			
		}
		else if(operand instanceof TABinaryFormulae)
		{
			TABinaryFormulae temp = (TABinaryFormulae)operand;
			if(temp.result instanceof TABool)
			{
				TABool temp1 = (TABool) temp.result;
				result = new TABool(!(temp1.getValue()));
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
		return "Not";
	}
}
