//TATerm: result is arithmetic
public abstract class TATerm extends TAElement
{
	protected TAValue value;
	public TAValue getValue()
	{
		return this.value;
	}
	public abstract void list();
	public abstract void evaluate();

}