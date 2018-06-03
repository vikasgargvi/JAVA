import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Circle c;
		Triangle t;
		Cube cu;
		Sphere sp;

		Shape[] sh = new Shape[10];

		Scanner inp = new Scanner(System.in);
		Random r = new Random();

		for(int i = 0; i < 10; i++)
		{
			int x = r.nextInt(4);

			if(x == 0)
			{
				sh[i] = new Circle();
			}
			else if(x == 1)
			{
				sh[i] = new Triangle();
			}
			else if(x == 2)
			{
				sh[i] = new Cube();
			}
			else if(x == 3)
			{
				sh[i] = new Sphere();
			}
		}

		System.out.println("done");

		for(int i = 0; i < 10; i++)
		{
			System.out.println("Inside");
			if(sh[i] instanceof Circle)
			{
				System.out.println("\nCIRCLE");
				c = (Circle)sh[i];
				System.out.print("Radius: ");
				double rd = inp.nextDouble();
				c.getRadius(rd);
				System.out.println("Peri: " + c.getPerimeter());
				System.out.println("Area: " + c.getArea());	
			}
			else if(sh[i] instanceof Triangle)
			{
				System.out.println("\nTRIANGLE");
				t = (Triangle)sh[i];
				System.out.println("Enter sides: ");
				double s1 = inp.nextDouble();
				double s2 = inp.nextDouble();
				double s3 = inp.nextDouble();
				t.getSides(s1, s2, s3);
				System.out.println("Peri: " + t.getPerimeter());
				System.out.println("Area: " + t.getArea());
			}
			else if(sh[i] instanceof Cube)
			{
				System.out.println("\nCUBE");
				cu = (Cube)sh[i];
				System.out.print("side: ");
				double si = inp.nextDouble();
				cu.getSide(si);
				System.out.println("Area: " + cu.getArea());
				System.out.println("Volume: " + cu.getVolume());
			}
			else if(sh[i] instanceof Sphere)
			{
				System.out.println("\nSPHERE");
				sp = (Sphere)sh[i];
				System.out.print("Radius: ");
				double rd = inp.nextDouble();
				sp.getRadius(rd);
				System.out.println("Area: "+ sp.getArea());
				System.out.println("Volume: " + sp.getVolume());
			}
		}
	}
}
