 public class TACeiling extends TAUnaryTerm{
	 
	public TACeiling(TADouble operand){
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
	 

	public String operatorSign(){
		return "Ceiling";
	}
 }