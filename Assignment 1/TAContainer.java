import java.util.ArrayList;
public abstract class TAContainer
{
	
}

class TAArray extends TAContainer
{
	private ArrayList<TAType> elems;
}

class TAPair extends TAContainer
{
	private TAType elem1;
	private TAType elem2;
}