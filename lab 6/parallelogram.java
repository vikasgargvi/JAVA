public class parallelogram extends trapezium{

	public parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
			super(x1, y1, x2, y2, x3, y3, x4, y4);
		}

	public double areallgm(){
		double area;
		double a = p1.getDistance(p2);
		double h = this.p1.y - this.p4.y;
		area = a * h;
		return area;
	}
}