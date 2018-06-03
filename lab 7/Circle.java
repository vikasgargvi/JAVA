public class Circle extends Shape_2D
{
	private double radius;

	public void getRadius(double r)
	{
		radius = r;
	}

	public double getArea()
	{
		return 3.14 * radius * radius;
	}

	public double getPerimeter()
	{
		return 2 * 3.14 * radius;
	}
}
