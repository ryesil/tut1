package tut1;

public class RationalRunner {
public static void main(String[] args) {
Rational r1=new Rational(4,2);
Rational r2=new Rational(2,3);
System.out.println(r1);
System.out.println(r1.add(r2));
System.out.println(r1.getNumerator());
System.out.println(r1.getDenominator());
System.out.println(r2.getNumerator());
System.out.println(r2.getDenominator());
System.out.println(r1.subtract(r2));
System.out.println(r1.multiply(r2));
System.out.println(r1.divide(r2));
System.out.println(Rational.gcd(2,4));	
	
}
}
