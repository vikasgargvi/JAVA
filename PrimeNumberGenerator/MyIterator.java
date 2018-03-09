import java.util.*;

public class MyIterator implements Iterator<Integer>
{
	private ArrayList<Integer> list;
	private int index;

	public MyIterator(ArrayList<Integer> list)
	{
		this.list = list;
		this.index = 0;
	}

	// check whether next element is present in kist or not
	public boolean hasNext()
	{
		if(this.index < this.list.size())
			return true;
		else 
			return false;
	}

	//return element from list if there is any element remaining 
	public Integer next()
	{
		return this.list.get(this.index++);
	}
}