import java.util.ArrayList;
public abstract class TAContainer extends TAObject
{
	
}

class TAArray extends TAContainer
{
	private ArrayList<TAObject> elems = new ArrayList<TAObject>();
	public TAObject get(int i)
	{
		return elems.get(i);
	}

	public int size()
	{
		return elems.size();
	}
}

class TAPair extends TAContainer
{
	private TAObject elem1;
	private TAObject elem2;
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