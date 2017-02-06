import java.util.ArrayList;
public abstract class TAContainer
{
	
}

class TAArray<T> extends TAContainer
{
	private ArrayList<T> elems;

	public T get(int i)
	{
		return elems.get(i);
	}

	public int size()
	{
		return elems.size();
	}
}

class TAPair<A,B> extends TAContainer
{
	private A elem1;
	private B elem2;

	public A first()
	{
		return elem1;
	}

	public B next()
	{
		return elem2;
	}

}