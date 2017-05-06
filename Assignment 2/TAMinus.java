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


	 @Override
	 public TAValue evaluate() {
		 return null;
	 }

	 public void list(){
		System.out.println("( Minus ");
		operand.list();
		System.out.println(")");
		System.out.println();
	}

	 @Override
	 public String operatorSign() {
		 return " - ";
	 }

 }