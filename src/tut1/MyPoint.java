package tut1;

public class MyPoint {

	private double x;
	private double y;

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}
	
	public MyPoint() {
		this.x=0;
		this.y=0;
	}

	public MyPoint(double x, double y) {
		this.x=x;
		this.y=y;
	}

	
	public double distance(double x1, double y1) {
		return Math.sqrt(Math.pow(x1-this.x, 2)+Math.pow(y1-this.y, 2));
	}
	
	public double distane2(MyPoint point) {
		return distance(point.x,point.y);
		
	}
	
}
