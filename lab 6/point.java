public class point{
	public double x;
	public double y;

	public point(double a, double b){
		this.x = a;
		this.y = b;
	}

	public double getDistance(point p2){
		double a = (this.x - p2.x) * (this.x - p2.x);
		double b = (this.y - p2.y) * (this.y - p2.y);
		return Math.sqrt(a + b);
	}

	public String toString(){
		String str = "";
		str += "(" + this.x + ", " + this.y + ")";
		return str;
	}
}