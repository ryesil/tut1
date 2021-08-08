package tut1;

import java.util.Scanner;

public class Time {

public long time=System.currentTimeMillis();
private int hour;
private int minute;
private int second;

public Time(long elapsedTime) {
	long totalSecond=elapsedTime/1000;
	second=(int)(totalSecond%60L);
	long totalMinutes=totalSecond/60;
	minute=(int)(totalMinutes%60);
	long totalhour=totalMinutes/60;
	hour=(int)(totalhour%24);
}

public Time(){

}

public Time(int hour, int minute, int second) {
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}


public String toString() {
return String.format("%02d:%02d:%02d", hour,minute,second);	
	
	
	
}
public long getTime() {
	return time;
}

public void setTime(long time) {
	this.time = time;
}

public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	this.minute = minute;
}

public int getSecond() {
	return second;
}

public void setSecond(int second) {
	this.second = second;
}

	
}





