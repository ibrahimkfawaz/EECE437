
public class TACeiling extends TAUnaryTerm
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Ceiling ");
			operand.list();
			System.out.print(" )");
		}
		else
		{
			System.out.print(this.getName());
		}
	}
	public TACeiling(TADouble val)
	{
		operand = val;
		result = new TADouble(Math.ceil(val.getValue()));
	}
	public TACeiling(TAInt val)
	{
		operand = val;
		result = new TAInt(val.getValue());
	}
	public TACeiling(String a)
	{
		super.setName(a);
	}
	public TACeiling(UnaryOperation val)
	{
		operand=val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(Math.ceil(temp.getValue()));
		}
	}
	public TACeiling(BinaryOperation val)
	{
		operand = val;
		if(val.result instanceof TAInt)
		{
			TAInt temp = (TAInt) val.result;
			result = new TAInt(temp.getValue());
		} 
		else if(val.result instanceof TADouble)
		{
			TADouble temp = (TADouble) val.result;
			result = new TADouble(Math.ceil(temp.getValue()));
		}
	}
	public void evaluate()
	{
		if(operand instanceof TAInt)
		{
			TAInt temp = (TAInt)operand;
			result = new TAInt(temp.getValue());
		}
		else if(operand instanceof TADouble)
		{
			TADouble temp = (TADouble)operand;
			result = new TADouble(Math.ceil(temp.getValue()));
		}
		else if(operand instanceof UnaryOperation)
		{
			UnaryOperation temp = (UnaryOperation)operand;
			if(temp.result instanceof TAInt)
			{
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue());
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(Math.ceil(temp1.getValue()));
			}
			
		}
		else if(operand instanceof BinaryOperation)
		{
			
			BinaryOperation temp = (BinaryOperation)operand;
			if(temp.result instanceof TAInt)
			{	
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue());
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(Math.ceil(temp1.getValue()));
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
		return "Ceiling";
	}
}
