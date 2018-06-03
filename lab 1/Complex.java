import java.util.Scanner;

public class Complex
{
    public static void main(String[] args)
    {
	Scanner inp = new Scanner(System.in);

	System.out.println("real part of 1st no.: ");
	float r1 = inp.nextFloat();
	System.out.println("Imaginary part of 1st no.: ");
	float i1 = inp.nextFloat();
	Imag c1 = new Imag(r1, i1);

	System.out.println("real part of 2nd no.: ");
	float r2 = inp.nextFloat();
	System.out.println("imaginary part of 2nd no.: ");
	float i2 = inp.nextFloat();
	Imag c2 = new Imag(r2, i2);

	Imag sum = new Imag(0, 0);
	sum = c1.add(c2);
	System.out.println(c1 + " + " c2 + " = " + sum);

    }
}
