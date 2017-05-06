//TAElement which extends TAObject
//Each TAElement object holds a TAValue
//Classes deriving from it: TAFormulae(TAValue is Boolean) and TATerm(TAValue is Int/Double)

public abstract class TAElement extends TAObject
{
	protected TAValue value;
	public abstract TAValue evaluate();
	public abstract void list();
	public TAValue getValue()
	{
		return this.value;
	}
//	public void printState

}