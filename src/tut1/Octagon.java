package tut1;

public class Octagon extends GeometricObjects {
private double side;

	public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}

	public Octagon(String color, boolean filled, double side) {
	super(color, filled);
	this.side = side;
}

	public Octagon(double side) {
	super();
	this.side = side;
}

	public Octagon() {
	super();
}

	@Override
	public double getArea() {
		return (2+4/Math.sqrt(2))*side*side;
	}

	@Override
	public double getPerimeter() {
		
		return 8*side;
	}

	
	
	
}
