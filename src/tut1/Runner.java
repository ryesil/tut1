package tut1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
	Runner runner1=new Runner();
	
	Circle c1=new Circle(2);
	Rectangle r1=new Rectangle(3,2);
	GeometricObjects c2=new Circle(2);
	GeometricObjects r2=new Rectangle(5,4);
	Triangle t1=new Triangle(4,2,3);
	
	//System.out.println(c1.compareTo(t1));

	List<GeometricObjects> list2=new ArrayList<>();
	
	list2.add(c1);
	list2.add(r2);
	list2.add(r1);
	list2.add(t1);
	System.out.println(list2);
	Triangle t2=new Triangle(3,4,5);
	Octagon oct=new Octagon(5);
	Octagon oct2=(Octagon) oct.clone();
	list2.add(t2);
	list2.add(oct);
	list2.add(oct2);
	GeometricObjects[] arr= {c1,r2,r1,t1,t2,oct,oct2};
	
	
	System.out.println(totalArr(arr));
	System.out.println(totalArea(list2));

	}
	public static double totalArr(GeometricObjects[] list) {
		double sum=0;
		for(GeometricObjects w:list) {
			sum+=w.getArea();
		}
		return sum;
	}
	public static double totalArea(List<GeometricObjects> list) {
		double sum=0;
		for(GeometricObjects w:list) {
			sum+=w.getArea();
		}
		return sum;
	}


}
