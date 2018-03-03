public class TestPrime
{
	public static void main(String[] args)
	{

		long startTime = System.nanoTime();


		PrimeNumberGenerator p = new PrimeNumberGenerator(100000);

		while(p.hasNext())
		{
			System.out.print(" " + p.next());
		}

		long endTime   = System.nanoTime();
		double totalTime = endTime - startTime;
		System.out.println("\nTotal time: " + totalTime / 1000000);
	}
}