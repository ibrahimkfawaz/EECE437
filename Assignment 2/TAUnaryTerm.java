//TAUnaryTerm: TATerm that takes one operand
public abstract class TAUnaryTerm extends TATerm
{
	protected TAElement operand;
	//get the operand
	public TAElement getOperand()
	{
		return this.operand;
	}

	
	//set operand
	public void setOperand(TAElement op)
	{
		operand=op;
	}

	public void list()  {
	System.out.print( "(" + operatorSign() + " ");
	getOperand().list();
	System.out.print(")");
	System.out.println();
}

	public abstract String operatorSign();
}

