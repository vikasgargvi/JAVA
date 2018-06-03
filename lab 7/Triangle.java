public class Triangle extends Shape_2D
{
	private double side1;
	private double side2;
	private double side3;

	public void getSides(double s1, double s2, double s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	public double getArea()
	{
		double semi = getPerimeter()/2;
		return Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
	}

	public double getPerimeter()
	{
		return (side1 + side2 + side3);
	}
}
