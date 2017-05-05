//TAElement which extends TAObject
//Each TAElement object holds a TAValue
//Classes deriving from it: TAFormulae(TAValue is Boolean) and TATerm(TAValue is Int/Double)

public abstract class TAElement extends TAObject
{
	protected TAValue result;

}