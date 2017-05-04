//TABinaryTerm: TATerm that takes two operands
public abstract class TABinaryTerm extends TATerm
{
	protected TAElement operand1;
	protected TAElement operand2;
	//get operand1
	public TAElement getOperand1()
	{
		return this.operand1;
	}
	//get operand2
	public TAElement getOperand2()
	{
		return this.operand2;
	}
	//set operand1
	public void setOperand1(TAElement op)
	{
		operand1=op;
	}
	//set operand2
	public void setOperand2(TAElement op)
	{
		operand2=op;
	}


}