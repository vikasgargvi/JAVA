import java.util.*;

public class RadixBucketSort
{
	private ArrayList<Integer> items;
	private int size;

	public RadixBucketSort(ArrayList<Integer> arr)
	{
		this.size = arr.size();
		items = new ArrayList<Integer>(this.size);

		for(int i = 0; i < this.size; i++)
			this.items.add(arr.get(i));
	}

	public void sortList(int digit)
	{
		int x = 1;
		for(int i = 0; i < digit; i++)
			x *= 10;

		ArrayList<LinkedList<Integer>> b = new ArrayList<LinkedList<Integer>>(10);
		for(int i = 0; i < 10; i++)
			b.add(i, new LinkedList<Integer>());

		// Insert Elements into Bucket
		for(int i = 0; i < this.size; i++)
		{
			int d = this.items.get(i) % x;
			d = (d * 10) / x;
			b.get(d).add(this.items.get(i)); 
		}

		this.items.clear(); // Clear the list

		// Insert Elements back to List
		for(int j = 0; j < 10; j++)
		{
			ListIterator<Integer> itr = b.get(j).listIterator(0);
			while(itr.hasNext())
			{
				this.items.add(itr.next());
			}
		}
	}

	public String toString()
	{
		String str = "{ ";
		for(int x: this.items)
		{
			str += x + ", ";
		}
		return str + "}";
	}
}
