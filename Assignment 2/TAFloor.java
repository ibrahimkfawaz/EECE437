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

	 public TAValue evaluate(){
		 value.assignFloor(this.operand.evaluate());
		 return value;
	 }

	 public String operatorSign(){
		 return "floor";
	 }

 }