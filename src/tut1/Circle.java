package tut1;

public class Circle extends GeometricObjects {
private double radius;
	
public Circle() {
	super();
}
public Circle(double radius) {
	this.radius=radius;
}
public Circle(String color, boolean filled, double radius) {
	super(color, filled);
	this.radius = radius;
}

@Override
public double getArea() {
	
	return Math.PI*radius*radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

public int compareTo(Circle o) {
if(this.radius>o.radius) {
	return 1;
}else {
	return -1;
}

}
public double getDiameter() {
	return 2*radius;
}

@Override
public double getPerimeter() {
return 2*Math.PI*radius;
}
@Override
public String toString() {
	return "Circle [getArea()=" + getArea() + ", getRadius()=" + getRadius() + ", getDiameter()=" + getDiameter()
			+ ", getPerimeter()=" + getPerimeter() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
			+ ", getTimeCreated()=" + getTimeCreated() + "]";
}


	
}
