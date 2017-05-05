 public class TAMinus extends TAUnaryTerm{
	 
	public TAMinus(TADouble operand){
		 this.operand = operand;
	}
	 
	public TAMinus(TAInt operand){
		  this.operand=operand;
		 
	}
	 
	public TAMinus(TAUnaryTerm operand){
		  this.operand=operand;
		 
	}
	 
	public TAMinus(TABinaryTerm operand){
		 this.operand=operand;
	}
	  
	public void evaluate(){
		this.value = - operand.evaluate();
	}
	
	public void list(){
		String s;
        s="( - " + operand.list();
		System.out.println(s);
	}

 }