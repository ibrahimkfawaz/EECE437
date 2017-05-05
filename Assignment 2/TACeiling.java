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
	  
	public void evaluate(){
		this.value = Math.ceil(operand.evaluate());
	}
	
	public void list(){
		String s;
        s="( ceiling " + operand.list();
		System.out.println(s);
	}

 }