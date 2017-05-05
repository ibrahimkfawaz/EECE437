public class TADoubleValue extends TAValue
{
	private double val;
	//getter
	public double getDouble()
	{
		return this.val;
	}
	//setter
	public void setDouble(double val)
	{
		this.val=val;
	}
	
	public void setValue(TADoubleValue v){
		this.val = v.getDouble();
	}
	
	public void assignMinus(TAValue  op) {
		val = -op.getDouble();
	}
	
	//TODO add gettype
	
	public void assignPlus(TAValue op1, TAValue op2) {
		val = op1.getDouble() + op2.getDouble();
	}
	
	public void assignMinus(TAValue op1, TAValue op2) {
		val = op1.getDouble() - op2.getDouble();
	}
	
	public void assignProduct(TAValue op1, TAValue op2) {
		val = op1.getDouble() * op2.getDouble();
	}
	public void assignDivision(TAValue op1, TAValue op2) {
		val = op1.getDouble() / op2.getDouble();
	}
	
	
	public boolean assignlessThan(TAValue op) {
		return val < op.getDouble();
	}
	
	public boolean assignlessThanEq(TAValue op) {
		return val <= op.getDouble();
	}
	
	public boolean assignequal(TAValue op) {
		return val == op.getDouble();
	}
	
	public boolean assignbiggerThan(TAValue op) {
		return val > op.getDouble();
	}
	
	public boolean assignbiggerThanEq(TAValue op) {
		return val >= op.getDouble();
	}
	
}