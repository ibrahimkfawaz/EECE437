 public class TAFloor extends TAUnaryTerm{
	 
	public TAFloor(TADouble operand){
		 this.operand = operand;
	}
	 
	public TAFloor(TAInt operand){
		  this.operand=operand;
		 
	}
	 
	public TAFloor(TAUnaryTerm operand){
		  this.operand=operand;
		 
	}
	 
	public TAFloor(TABinaryTerm operand){
		 this.operand=operand;
	}
	  
	public void evaluate(){
		this.value = Math.floor(operand.evaluate());
	}
	
	public void list(){
		System.out.println("( floor ");
		operand.list();
		System.out.println(")");
		System.out.println();
	}

 }