package tut1;

public class MyDateRunnner {

	public static void main(String[] args) {
		MyDate date=new MyDate();
		date.setDate(561555550000L);
		System.out.println(date.getMonth());
		System.out.println(date.getDay());
		System.out.println(date.getYear());
	}

}
