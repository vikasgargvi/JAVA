import java.util.*;
import java.lang.*;

public class MyPolynomialTest{
	public static void main(String[] args){
	MyPolynomial p = new MyPolynomial(); // first polynomial
	MyPolynomial q = new MyPolynomial(); // second polynomial

	Scanner inp = new Scanner(System.in);

	char ch;
	
	System.out.println("Enter coefficient and exponent of first polymiomial");
	do{
		System.out.println("Coeff: ");	
		int c = inp.nextInt();
		System.out.println("Exp: ");
		int e = inp.nextInt();

		p.addTerm(c, e);

		System.out.println("press 'C' or 'c' to continue or any other key to exit ");
		ch = inp.next().charAt(0);

	}while(ch == 'C' || ch =='c');

	System.out.println("\nEnter the coefficient and exponent of second polynomil");
	do{
		System.out.println("Coeff: ");
		int c = inp.nextInt();
		System.out.println("Exp: ");
		int e = inp.nextInt();

		q.addTerm(c, e);
		System.out.println("press 'C' or 'c' to continue or any other key to exit");
		ch = inp.next().charAt(0);
	}while(ch == 'C' || ch == 'c');

	System.out.println("polynomial 1: " + p); // print first polynomial
	System.out.println("polynomial 2: " + q); // print second polynomial

	// sum of two polynomials saved into new object (sum)
	MyPolynomial sum = p.addPoly(q);
	System.out.println("sum of polynomials is: " + sum);

	// subtract two polynomials
	MyPolynomial sub = p.subPoly(q);
	System.out.println("Sub is : " + sub);

	// derivative of first polynomial
	MyPolynomial der = p.derivate();
	System.out.println("derivate of polynomial 1: " + der);

	// derivative of first polynomial
	der = q.derivate();
	System.out.println("derivate of polynomial 1: " + der);

	// evaluate the value of sum of polynomials at sum value of x
	System.out.println("evaluate sum at x? ");
	int x = inp.nextInt();
	System.out.println("Evaluate at x = " + x + "\n" + sum.evaluate(2));

	MyPolynomial mul = p.mulPoly(q);
	System.out.println("Multiply is: " + mul);

	MyPolynomial mulC = p.mulConst(2);
	System.out.println("Multiply with 2: " + mulC);
	} // main 
} // class MyPolynomialtest
