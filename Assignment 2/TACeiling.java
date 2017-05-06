 public class TACeiling extends TAUnaryTerm{
	 
	public TACeiling(TADouble operand){
		 value = new TAIntValue(0);
		 this.operand = operand;
	}
	 
	public TACeiling(TAInt operand){
		  this.operand=operand;
		 
	}
	 
	public TACeiling(TAUnaryTerm operand){
		  this.operand=operand;
		 
	}
	 
	public TACeiling(TABinaryTerm operand){
		 this.operand=operand;

	}
	  
	public TAValue evaluate(){
		value.assignCeiling(this.operand.evaluate());
		return value;

	}

	public void printstate(){
		System.out.print(value.getInt());
	}

	public void list()  {
		 System.out.print( "(" + operatorSign() + " ");
		 System.out.print(operand.getValue().getDouble());
		 System.out.print(")");
		 System.out.println();
	}


	public String operatorSign(){
		return "Ceiling";
	}
 }