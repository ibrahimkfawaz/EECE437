
public class TAIntValue extends TAValue
{
	private int val;
	//getter
	
	public TAIntValue(int v){this.val = v;}
	
	public boolean isInt(){return true;}
	
	public void setValue(TAIntValue v){
		this.val = v.getInt();
	}
	
	//TODO: gettype return int
	
	public int getInt()
	{
		return this.val;
	}
	
	public void setInt(int val)
	{
		this.val=val;
	}
	
	public void assignMinus(TAValue op){
		val = -op.getInt();
	}
	
	public void assignCeiling(TAValue op){
		val=(int) Math.ceil(op.getDouble());
	}
	
	public void assignFloor(TAValue op){
		val = (int) Math.floor(op.getDouble());
	}
	
		
	public boolean assignlessThan(TAValue  op) {
		return val < op.getDouble();
	}
	
	public boolean assignlessThanEq(TAValue  op) {
		return val <= op.getDouble();
	}
	
	public boolean assignequal(TAValue  op) {
		return val == op.getDouble();
	}
	
	public boolean assignbiggerThan(TAValue  op) {
		return val > op.getDouble();
	}
	
	public boolean assignbiggerThanEq(TAValue  op) {
		return val >= op.getDouble();
	}
	
}

