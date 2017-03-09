public class TAPair extends TACompositeType
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