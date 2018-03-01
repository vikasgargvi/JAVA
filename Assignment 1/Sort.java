import java.util.*;

public class Sort
{
	private ArrayList<Integer> items;
	private int size;

	public Sort(int arr[])
	{
		this.size = arr.length;
		items = new ArrayList<Integer>(this.size);

		for(int i = 0; i < this.size; i++)
			//this.items[i] = arr[i];
			this.items.add(arr[i]);
	}

	public void sortList(int e)
	{
		e = e * 10;
		LinkedList<Integer>[] b= null;
		for(int i = 0; i < 10; i++)
		{
			b[i] = new LinkedList<Integer>();
		}

		for(int i = 0; i < this.size; i++)
		{
			int d = this.items.get(i) % e;
			b[d].add(this.items.get(i)); 
		}

		this.items.clear();

		for(int j = 0; j < 10; j++)
		{
			if(b[j] == null)
				continue;

			int k = 0;
			ListIterator<Integer> itr = b[j].listIterator(0);
			while(itr.hasNext())
			{
				this.items.add(itr.next());// = itr.next();
				System.out.println(this.items.get(k) +" " );
				k++;
			}
		}
	}

	/*public void sortList1(int e)
	{
		e = e * 10;
		ArrayList<Integer>[] b = new ArrayList<Integer>();
		/*for(int i = 0; i < 10; i++)
		{
			b[i] = new LinkedList<Integer>();
		}*/
		//ArrayList<ArrayList<Integer>> b = null;

		/*for(int i = 0; i < this.size; i++)
		{
			int d = this.items[i] % e;

			/*if(b[d] == null)
				b[d] = new ArrayList<Integer>();*/

			/*b[d].add(this.items[i]); 
		}

		/*for(int i = 0; i < this.size; i++)
		{
			ListIterator<Integer> it = this.items.listIterator(0);
			while(it.hasNext())
			{
				int tmp = it.next();
				int d = tmp % e;
				
				if(b[d] == null)
					b[d] = new LinkedList<Integer>();

				b[d].add(tmp);
			}

		}*/

		//this.items.clear();

		/*for(int j = 0; j < 10; j++)
		{
			int k = 0;
			Iterator<Integer> itr = b[j].Iterator(0);
			while(itr.hasNext())
			{
				this.items[k] = itr.next();
				System.out.println(this.items[k] +" " );
				//this.items[k] = x;
				k++;
			}
		}
	}*/

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