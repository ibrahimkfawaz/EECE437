public class TAFloor extends TAUnaryTerm
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Floor ");
			operand.list();
			System.out.print(" )");
		}
		else
		{
			System.out.print(this.getName());
		}
	}
	public String type()
	{
		return "Floor";
	}
	public TAFloor(TADouble val)
	{
		operand = val;
		result = new TADouble(Math.floor(val.getValue()));
	}
	public TAFloor(TAInt val)
	{
		operand = val;
		result = new TAInt(val.getValue());
	}
	public TAFloor(String val)
	{
		super.setName(val);
	}
	public TAFloor(UnaryOperation val)
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
			result = new TADouble(Math.floor(temp.getValue()));
		}
	}
	public TAFloor(BinaryOperation val)
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
			result = new TADouble(Math.floor(temp.getValue()));
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
			result = new TADouble(Math.floor(temp.getValue()));
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
				result = new TADouble(Math.floor(temp1.getValue()));
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
				result = new TADouble(Math.floor(temp1.getValue()));
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
}