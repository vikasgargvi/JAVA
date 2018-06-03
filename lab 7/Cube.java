public class Cube extends Shape_3D
{
	private double side;

	public void getSide(double s)
	{
		side = s;
	}

	public double getArea()
	{
		return 6 * side * side;
	}

	public double getVolume()
	{
		return side * side * side;
	}
}
