package tut1;

import java.util.Scanner;

public class TimeRunner {

	public static void main(String[] args) {
	Time time=new Time();

	Time time2=new Time(555550000);
	
	System.out.println(time2.toString());
	Time time3=new Time(2,3,4);
	System.out.println(time3.toString());
	
}
}