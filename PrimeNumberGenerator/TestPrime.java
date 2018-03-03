public class TestPrime
{
	public static void main(String[] args)
	{

		long startTime = System.nanoTime();


		PrimeNumberGenerator prime = new PrimeNumberGenerator(100000);

		while(prime.hasNext())
		{
			System.out.print(" " + prime.next());
		}

		long endTime   = System.nanoTime();
		double totalTime = endTime - startTime;
		System.out.println("\nTotal time(in ms): " + totalTime / 1000000);
	}
}