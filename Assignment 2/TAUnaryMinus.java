
public class TAUnaryMinus extends TAUnaryTerm
{
	TAObject operand;
	public void list()
	{
		if(this.getName().equals(""))
		{
			System.out.print("( " + "Minus ");
			operand.list();
			System.out.print(" )");
		}
		else
		{
			System.out.println(this.getName());
		}
	}
	public TAUnaryMinus(TAInt val)
	{
		operand = val;
		result = new TAInt(val.getValue()*-1);
	}
	public TAUnaryMinus(TADouble val)
	{
		operand = val;
		result = new TADouble(val.getValue()*-1);
	}
	public TAUnaryMinus(String val)
	{
		super.setName(val);
	}
	public TAUnaryMinus(TAUnaryTerm val)
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
			result = new TADouble(temp.getValue());
		}
	}
	public TAUnaryMinus(TABinaryTerm val)
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
			result = new TADouble(temp.getValue());
		}
	}
	public void evaluate()
	{
		if(operand instanceof TAInt)
		{
			TAInt temp = (TAInt)operand;
			result = new TAInt(temp.getValue()*-1);
		}
		else if(operand instanceof TADouble)
		{
			TADouble temp = (TADouble)operand;
			result = new TADouble(temp.getValue()*-1);
		}
		else if(operand instanceof TAUnaryTerm)
		{
			TAUnaryTerm temp = (TAUnaryTerm)operand;
			if(temp.result instanceof TAInt)
			{
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue()*-1);
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(temp1.getValue()*-1);
			}
			
		}
		else if(operand instanceof TABinaryTerm)
		{

			TABinaryTerm temp = (TABinaryTerm)operand;
			if(temp.result instanceof TAInt)
			{	
				TAInt temp1 = (TAInt) temp.result;
				result = new TAInt(temp1.getValue()*-1);
			} 
			else if(temp.result instanceof TADouble)
			{
				TADouble temp1 = (TADouble) temp.result;
				result = new TADouble(temp1.getValue()*-1);
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
		return "Minus";
	}
}
