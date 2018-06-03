import java.util.*;

public class mainClass{
	public static void main(String[] args){
		double[] x = new double[4];
		double[] y = new double[4];

		Scanner inp = new Scanner(System.in);

		for(int i = 0; i < 4; i++){
			System.out.println("\nEnter " + (i + 1) + " coordinate..");
			
			System.out.printf("x: ");
			x[i] = inp.nextFloat();			

			System.out.printf("y: ");
			y[i] = inp.nextFloat();			
		}

		square s = new square(x[0], y[0], x[1], y[1], x[2], y[2], x[3], y[3]);

		// display Coordinates
		System.out.println("A " + s.p1);
		System.out.println("B " + s.p2);
		System.out.println("C " + s.p3);
		System.out.println("D " + s.p4);

		// calculate sides
		double s1 = s.p1.getDistance(s.p2);
		double s2 = s.p2.getDistance(s.p3);
		double s3 = s.p3.getDistance(s.p4);
		double s4 = s.p4.getDistance(s.p1);

		// calculate diagonals
		double d1 = s.p1.getDistance(s.p3);
		double d2 = s.p4.getDistance(s.p2);

		//slopes
		double m1 = ;
		double m

		double area;
		double para;

		// menu 
		if(s1 == s3 && s1 == s2);
		{
			System.out.println("This is the coordinates of Square...\n");
			area = s.areaSqr();
		}
		else if(s1 == s3 && s2 == s4 && d1 == d2){
			System.out.println("This is the coordinates of Rectangle...\n");
			area = s.areaRect();
		}
		else if(s1 == s3 && s2 == s4 && d1 != d2){
			System.out.println("This is the coordinates of Parallelogram...\n");
			area = s.areallgm();
		}
		else if()

		double para = s.parameter();
		System.out.println("Parameter of quadrilateral: " + para);
	}
}