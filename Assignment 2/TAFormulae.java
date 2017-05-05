	//TAFormulae: Result is boolean
public abstract class TAFormulae extends TAElement
{
	protected TABoolValue value;
	public TAValue getValue()
	{
		return this.value;
	}
	public abstract void list();

}

