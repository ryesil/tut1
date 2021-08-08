package tut1;

public class Circle2D {
private double x;
private double y;
private double radius;

public void setX(double x) {
	this.x=x;
}
public double getX() {
	return x;
}
public void setY(double y) {
	this.y=y;
}
public double getY() {
	return y;
}
public void setRadius(double radius) {
	this.radius=radius;
}
public double getRadius() {
	return radius;
}

public Circle2D() {
	x=0;
	y=0;
	radius=1;
}
public Circle2D(double x, double y, double radius) {
	this.x=x;
	this.y=y;
	this.radius=radius;
}

public double getArea() {
	return radius*radius*Math.PI;
}
public double getCircumference() {
	return 2*radius*Math.PI;
}
public boolean isContain(double x, double y) {
	boolean isContain=false;
	double distance=Math.sqrt(Math.pow(x-this.x, 2)+Math.pow(y-this.y, 2));
	if(distance<radius) {
		isContain=true;
	}
	return isContain;
}

public double distance(Circle2D circle) {
	
	return Math.sqrt(Math.pow(circle.x-this.x, 2)+Math.pow(circle.y-this.y, 2));
}

public boolean isContain(Circle2D circle) {
	boolean isContained=false;
	double distance= distance(circle);
	if((distance+2*circle.getRadius())<this.radius) {
		isContained=true;
	}
	return isContained;
}
public boolean isOverlap(Circle2D circle) {
	boolean isOverlapping=false;
	double distance= distance(circle);
	if((distance+2*circle.getRadius())==this.radius) {
		isOverlapping=true;
	}
	return isOverlapping;
}



}
