//TAUnaryTerm: TATerm that takes one operand
public abstract class TAUnaryFormulae extends TAFormulae
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
}
