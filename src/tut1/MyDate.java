package tut1;

public class MyDate {
private int year;
private int month;
private int day;

public MyDate() {	
}
public MyDate(int year,int month,int day) {
	this.year=year;
	this.month=month;
	this.day=day;	
}

public int getYear() {
	return year;
}
public int getMonth() {
	return month;
}
public int getDay() {
	return day;
}

public void setDate(long elapsedTime) {
	long totalDay=elapsedTime/(1000*60*60*24);
	int totalMonth=(int)(totalDay/30);
		day=(int)totalDay%30;
	year=totalMonth/12;
		month=totalMonth%12;
}








	
	
}
