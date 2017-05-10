# EECE437

1) Class Hierarchy: 
	a) TAObject, an asbtract class that all implemented classes derive from. Has a name field and get/set for the name
	b) TAType: an abstract class that all primitive types derive from
	c) Primitive types: TAInt representing integers, TADouble representing Doubles and TABool representing Boolean. 
	d) Unary Operations: UnaryOperations class that all classes representing unary operations derive from; Not,Unary Minus, Floor and Ceiling.
	e) Binary Operations: BinaryOperations class that all classes representing binary operations derive from; Add, Multiply, Divide, Subtract, Implies, AND, OR, XOR, Less than and more than
	f) TAContainer: the root abstract class of the Pair class(TAPair) and the Array class (TAArray)

2) Design decisions:
	a) Everything deriving from a single root class removes a lot of the complexity of matching types and tackling different types using a huge number of constructors/functions
	b) Making decisions inside execution depends on the types and instances of the classes, casting is done inside the constructors depending on the instances of the passed operands


Concerning Assignment 2: 

The assignment isn't fully done. Most of the features are done though.
Hopefully assignments 2 and 3 will be submitted in the next couple of days