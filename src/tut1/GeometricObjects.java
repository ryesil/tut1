package tut1;

import java.time.LocalTime;

public abstract class GeometricObjects implements Comparable<GeometricObjects>, Cloneable{
private String color="white";
private boolean filled;
private LocalTime timeCreated;

//No-arg Constructor
public GeometricObjects() {
timeCreated=LocalTime.now();
}
//Constructor with color and filled.
public GeometricObjects(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
	timeCreated=LocalTime.now();
}
// Java beans
public String getColor() {
	return color;
}

public Object clone() {
	try {
		GeometricObjects geo=(GeometricObjects) super.clone();
		return geo;
	}catch(CloneNotSupportedException e) {
		System.out.println("Couldn't be cloned.");
		return null;
	}
}

public void setColor(String color) {
	this.color = color;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}

public LocalTime getTimeCreated() {
	return timeCreated;
}

public abstract double getArea();

public abstract double getPerimeter();

@Override
public String toString() {
	return "GeometricObject [color=" + color + ", filled=" + filled + ", timeCreated=" + timeCreated + "]";
}


public int compareTo(GeometricObjects o) {
	if(this.getArea()>o.getArea()) {
		return 1;
	}else if(this.getArea()<o.getArea()){
		return -1;
	}else {
		return 0;
	}
	
}



}
