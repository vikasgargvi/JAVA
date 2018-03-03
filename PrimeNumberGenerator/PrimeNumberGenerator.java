public class PrimeNumberGenerator
{
	private int last;
	private int index;
	private int prev;

	public PrimeNumberGenerator(int k)
	{
		this.last = k; 
		this.index = 2;
	}

	public boolean hasNext()
	{
		int flag;
		while(this.index <= this.last)
		{
			flag = 0;
			for (int i = 2; i <= Math.sqrt(index); i++)
			{
				if(this.index % i == 0)
				{
					flag = 1;
					break;
				}
			}

			this.prev = this.index;
			if(this.index != 2)
				this.index += 2;
			else   
				this.index++;

			if(flag == 0)
				return true;

		}
		return false;
	}

	public int next()
	{
		return this.prev;
	}
}