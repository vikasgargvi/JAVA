public class Sphere extends Shape_3D
{
	private double radius;

	public void getRadius(double r)
	{
		radius = r;
	}

	public double getVolume()
	{
		return 4/3 * 3.14 * radius * radius * radius;
	}

	public double getArea()
	{
		return 4 * 3.14 * radius * radius;
	}
}
