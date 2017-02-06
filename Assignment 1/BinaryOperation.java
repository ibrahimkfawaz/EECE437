public abstract class BinaryOperation
{
	public TAType result;
}

class TAImplies extends BinaryOperation
{
	public TAImplies(TABool op1,TABool op2)
	{
		result = new TABool((!op1.getValue()) || op2.getValue());
	}
}

class TAAnd extends BinaryOperation
{
	public TAAnd(TABool op1,TABool op2)
	{
		result = new TABool(op1.getValue() && op2.getValue());
	}
}

class TAXor extends BinaryOperation
{
	public TAXor(TABool op1,TABool op2)
	{
		result = new TABool(op1.getValue() ^ op2.getValue());
	}
}

class TAOr extends BinaryOperation
{
	public TAOr(TABool op1,TABool op2)
	{
		result = new TABool(op1.getValue() || op2.getValue());
	}
}

class TAAdd extends BinaryOperation
{
	public TAAdd(TAInt op1,TAInt op2)
	{
		result = new TAInt(op1.getValue() + op2.getValue());
	}

	public TAAdd(TADouble op1,TADouble op2)
	{
		result = new TADouble(op1.getValue() + op2.getValue());
	}
}

class TASubtract extends BinaryOperation
{
	public TASubtract(TAInt op1,TAInt op2)
	{
		result = new TAInt(op1.getValue() - op2.getValue());
	}

	public TASubtract(TADouble op1,TADouble op2)
	{
		result = new TADouble(op1.getValue() - op2.getValue());
	}
}

class TAMultiply extends BinaryOperation
{
	public TAMultiply(TAInt op1,TAInt op2)
	{
		result = new TAInt(op1.getValue() * op2.getValue());
	}

	public TAMultiply(TADouble op1,TADouble op2)
	{
		result = new TADouble(op1.getValue() * op2.getValue());
	}	
}

class TADivide extends BinaryOperation
{
	public TADivide(TAInt op1,TAInt op2)
	{
		result = new TADouble(op1.getValue() / op2.getValue());
	}

	public TADivide(TADouble op1,TADouble op2)
	{
		result = new TADouble(op1.getValue() / op2.getValue());
	}
}

class TAMoreThan extends BinaryOperation
{
	public TAMoreThan(TAInt op1,TAInt op2)
	{
		result = new TABool(op1.getValue() > op2.getValue());
	}

	public TAMoreThan(TADouble op1,TADouble op2)
	{
		result = new TABool(op1.getValue() > op2.getValue());
	}
}

class TALessThan extends BinaryOperation
{
	public TALessThan(TAInt op1,TAInt op2)
	{
		result = new TABool(op1.getValue() < op2.getValue());
	}
	public TALessThan(TADouble op1,TADouble op2)
	{
		result = new TABool(op1.getValue() < op2.getValue());
	}
}

class TAEquals extends BinaryOperation
{
	public TAEquals(TAInt op1,TAInt op2)
	{
		result = new TABool(op1.getValue() == op2.getValue());
	}
	public TAEquals(TADouble op1,TADouble op2)
	{
		result = new TABool(op1.getValue() == op2.getValue());
	}
}