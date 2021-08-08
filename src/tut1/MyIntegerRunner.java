package tut1;

public class MyIntegerRunner {

	public static void main(String[] args) {
int a=MyInteger.parseInt(new char[]{'1','2'});
System.out.println(a);

MyInteger integer=new MyInteger(12);
System.out.println(integer.isEqual(113));
MyInteger num2=new MyInteger(143);
System.out.println(num2.isEven());

System.out.println(MyInteger.parseInt("123"));


	}

}
