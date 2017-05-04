public class TAValue extends TAObject
{
	//TAValue represents the actual value of a Term that is what it actually holds
}

public class TAIntValue extends TAValue
{
	private int val;
	//getter
	public int getValue()
	{
		return this.val;
	}
	//setter
	public void setValue(int val)
	{
		this.val=val;
	}
}

public class TADoubleValue extends TAValue
{
	private double val;
	//getter
	public double getValue()
	{
		return this.val;
	}
	//setter
	public void setValue(double val)
	{
		this.val=val;
	}
}

public class TABoolValue extends TAValue
{
	private boolean val;
	//getter
	public boolean getValue()
	{
		return this.val;
	}
	//setter
	public void setValue(boolean val)
	{
		this.val=val;
	}
}

public class TAArrayValue extends TAValue
{
	private ArrayList<TAValue>;

	TAArrayValue()
}

public class TAPairValue extends TAValue
{
	private TAValue val1;
	private TAVAlue val2;
}