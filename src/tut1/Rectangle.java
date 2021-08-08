package tut1;

public class Rectangle extends GeometricObjects {
private double width;
private double height;




public Rectangle() {
	super();
}
public Rectangle(double width, double height) {
	super();
	this.width = width;
	this.height = height;
}	
	
	public Rectangle(String color, boolean filled, double width, double height) {
	super(color, filled);
	this.width = width;
	this.height = height;
}
	@Override
	public String toString() {
		return "Rectangle [getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + ", getColor()=" + getColor()
				+ ", isFilled()=" + isFilled() + ", getTimeCreated()=" + getTimeCreated() + "]";
	}
	@Override
	public double getArea() {
		return height*width;
	
	}

	@Override
	public double getPerimeter() {
		return 2*(height+width);
	}
	


	



}
