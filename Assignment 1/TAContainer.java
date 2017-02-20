//Pair and Array extend TAContainer
// type() returns a String with the name of the type
import java.util.ArrayList;
public abstract class TAContainer extends TAObject
{
	
}

class TAArray extends TAContainer
{
	public void list()
	{
		System.out.println(this.getName());
	}
	//since all classes derive from TAObject, ? is a wildcard to represent the type of object inside the arraylist
	private ArrayList<? extends TAObject> elems;
	public String type()
	{
		return "Array";
	}
	//get object at i'th position
	public TAObject get(int i)
	{
		return elems.get(i);
	}
	//a represents the name of the array, type takes in a String which is passed through the type() method inside each object
	//n is the size
	//will check the type and create a new arraylist based on the type
	TAArray(String a,String type,int n)
	{
		this.setName(a);
		if(type.equals("Boolean"))
		{
			elems = new ArrayList<TABool>(n);
		}
		else if(type.equals("Integer"))
		{
			elems = new ArrayList<TAInt>(n);
		}
		else if(type.equals("Double"))
		{
			elems = new ArrayList<TADouble>(n);
		}
		else if(type.equals("Not"))
		{
			elems = new ArrayList<TANot>(n);
		}
		else if(type.equals("Minus"))
		{
			elems = new ArrayList<TAMinus>(n);
		}
		else if(type.equals("Ceiling"))
		{
			elems = new ArrayList<TACeiling>(n);
		}
		else if(type.equals("Floor"))
		{
			elems = new ArrayList<TAFloor>(n);
		}
		else if(type.equals("And"))
		{
			elems = new ArrayList<TAAnd>(n);
		}
		else if(type.equals("Or"))
		{
			elems = new ArrayList<TAOr>(n);
		}
		else if(type.equals("Xor"))
		{
			elems = new ArrayList<TAXor>(n);
		}
		else if(type.equals("Implies"))
		{
			elems = new ArrayList<TAImplies>(n);
		}
		else if(type.equals("Add"))
		{
			elems = new ArrayList<TAAdd>(n);
		}
		else if(type.equals("Multiply"))
		{
			elems = new ArrayList<TAMultiply>(n);
		}
		else if(type.equals("Subtract"))
		{
			elems = new ArrayList<TASubtract>(n);
		}
		else if(type.equals("Divide"))
		{
			elems = new ArrayList<TADivide>(n);
		}
		else if(type.equals("MoreThan"))
		{
			elems = new ArrayList<TAMoreThan>(n);
		}
		else if(type.equals("LessThan"))
		{
			elems = new ArrayList<TALessThan>(n);
		}
	}
	public int size()
	{
		return elems.size();
	}
}

class TAPair extends TAContainer
{
	//elements inside the pair
	private TAObject elem1;
	private TAObject elem2;
	public void list()
	{
		System.out.println(this.getName());
	}
	public String type()
	{
		return "Pair";
	}
	public TAPair(TAObject op1,TAObject op2)
	{
		this.elem1 = op1;
		this.elem2 = op2;
	}
	public TAObject first()
	{
		return elem1;
	}

	public TAObject next()
	{
		return elem2;
	}

}