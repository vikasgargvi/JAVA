import java.util.ArrayList;

public class PrimeNumberGenerator
{
	private int last;
	private ArrayList<Integer> list;

	public PrimeNumberGenerator(int k)
	{
		this.last = k; 
		list = new ArrayList<Integer>(k);

		int value = 2;
		int count = 0;
		int flag;

		// initializing list with k prime numbers
		while(count < this.last)
		{
			flag = 0;
			for (int i = 2; i <= Math.sqrt(value); i++)
			{
				if(value % i == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				this.list.add(count++, value);
			}
			if(value != 2)
				value += 2;
			else   
				value++;
		}
	}

	// get the list
	public ArrayList<Integer> getPrime()
	{
		return this.list;
	}
	
}
