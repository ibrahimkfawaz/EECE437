public class TAValue extends TAObject
{
	//TAValue represents the actual value of a Term i.e what it actually holds
		
	public boolean isPair()
	{
		return false;
	}
	public boolean isArray()
	{
		return false;
	} 	
	public boolean isDouble()
	{
		return false;
	}
	public boolean isInt()
	{
		return false;
	}
	public boolean isBool()
	{
		return false;
	}

	public int getInt()
	{
		return 0;
	}
	public double getDouble()
	{
		return 0.0;
	}
	public boolean getBool()
	{
		return false;
	}
	public TAValue getArray()
	{

	}
	public TAValue getPair()
	{
		
	}

	public void assignMinus(TAValue op) {}
	public void assignNot(TAValue op) {}
	public void assignCeiling(TAValue op){ }
	public void assignFloor(TAValue op){ }
	public void assignPlus(TAValue op1, TAValue op2) { }
  	public void assignSubtract(TAValue op1, TAValue op2) {  }
 	public void assignProduct(TAValue op1, TAValue op2) {  }
 	public void assignDivision(TAValue op1, TAValue op2) {  }
 	public void assignLessThan(TAValue op1, TAValue op2) {}
  	public void assignEqual(TAValue op1, TAValue op2) {}
  	public void assignGreaterThan(TAValue op1, TAValue op2) {}
  	public void assignLAnd(TAValue op1, TAValue op2) { }
 	public void assignLOr(TAValue op1, TAValue op2) { }
 	public void assignEquiv(TAValue op1, TAValue op2) { }
 	public void assignImplies(TAValue op1, TAValue op2) { }
		
}
