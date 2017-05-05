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
		String s;
        s="( ceiling " + operand.list();
		System.out.println(s);
	}

 }