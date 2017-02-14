public abstract class BinaryOperation
{
	private TAType result;
	private String name;
	public String setName(String name)
	{
		this.name = name;
	}
	public void list()
	{
		System.out.println(name);
	}
}

class TAImplies extends BinaryOperation
{
	public TAImplies(TABool op1,TABool op2)
	{
		result = new TABool((!op1.getValue()) || op2.getValue());
	}
	public TAImplies(String a)
	{
		super.setName(a);
	}
}

class TAAnd extends BinaryOperation
{
	public TAAnd(TABool op1,TABool op2)
	{
		result = new TABool(op1.getValue() && op2.getValue());
	}
	public TAAnd(String a)
	{
		super.setName(a);
	}
}

class TAXor extends BinaryOperation
{
	public TAXor(TABool op1,TABool op2)
	{
		result = new TABool(op1.getValue() ^ op2.getValue());
	}
	public TAXor(String a)
	{
		super.setName(a);
	}
}

class TAOr extends BinaryOperation
{
	public TAOr(TABool op1,TABool op2)
	{
		result = new TABool(op1.getValue() || op2.getValue());
	}
	public TAOr(String a)
	{
		super.setName(a);
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
	public TAAdd(String a)
	{
		super.setName(a);
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
	public TASubtract(String a)
	{
		super.setName(a);
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
	public TAMultiply(String a)
	{
		super.setName(a);
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
	public TADivide(String a)
	{
		super.setName(a);
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
	public TAMoreThan(String a)
	{
		super.setName(a);
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
	public TALessThan(String a)
	{
		super.setName(a);
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
	public TAEquals(String a)
	{
		super.setName(a);
	}
}