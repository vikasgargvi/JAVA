public class quadrilateral{
	public point p1;
	public point p2;
	public point p3;
	public point p4;

	public quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		p1 = new point(x1, y1);
		p2 = new point(x2, y2);
		p3 = new point(x3, y3);
		p4 = new point(x4, y4);
	}

	public double parameter(){
		double p = p1.getDistance(p2);
		p += p2.getDistance(p3);
		p += p3.getDistance(p4);
		p += p4.getDistance(p1);
		return p;
	}

}