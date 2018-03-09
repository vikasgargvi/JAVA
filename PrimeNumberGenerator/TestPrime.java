import java.util.*;

public class TestPrime
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter the value of k? ");
		int k = inp.nextInt();

		// check k must be greater than 0 to generat prime numbers 
		if(k < 0)
		{
			System.out.println("Wrong Input");
			return;
		}

		// Generate k Prime Numbers 
		PrimeNumberGenerator p = new PrimeNumberGenerator(k); 

		// Iterator object to Iterate the list
		MyIterator itr = new MyIterator(p.getPrime());

		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
	}
}
