package tut1;

public class Rational extends Number implements Comparable<Rational>{

	private int numerator;
	private int denominator;
	
	
	
	public Rational() {
	
	}
public Rational(int[] r) {
this.numerator=r[0];
this.denominator=r[1];
}
	
	public Rational(int numerator, int denominator) {
		if(denominator!=0) {
		this.numerator = numerator/gcd(numerator,denominator);
		this.denominator = denominator/gcd(numerator,denominator);
		} else {
			throw new ArithmeticException("Denimonator must be different than zero");
		}
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if(denominator!=0)
		this.denominator = denominator;
		else 
		throw new ArithmeticException("Cannot be zero");
	}

	
	public Rational add( Rational r) {
		int denom=this.numerator*r.denominator+this.denominator*r.numerator;
		int numer=this.denominator*r.denominator;
		return new Rational(denom,numer);
		
	}
	
	public Rational subtract(Rational r) {
		int numer=this.numerator*r.denominator-this.denominator*r.numerator;
		int denom=this.denominator*r.denominator;
		return new Rational(numer,denom);
	}
	
	public Rational multiply(Rational r) {
		int numer=this.numerator*r.numerator;
		int denom=this.denominator*r.denominator;
		return new Rational(numer/gcd(numer,denom),denom/gcd(numer,denom));
	}
	public Rational divide(Rational r) {
		int numer=this.numerator*r.denominator;
		int denom=this.denominator*r.numerator;
		return new Rational(numer/gcd(numer,denom),denom/gcd(numer,denom));
	}
	
	public static int gcd(int n,int d) {
		n=Math.abs(n);
		d=Math.abs(d);
		int gcd=1;
		for(int i=1;i<=n&&i<=d;i++) {
			if(n%i==0&&d%i==0&&i>gcd) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	@Override
	public String toString() {
		if(denominator!=1)
		return numerator+"/"+denominator;
		return numerator+"";
	}

	@Override
	public int compareTo(Rational o) {
		if(doubleValue()>o.doubleValue()) {
			return 1;
		}else if(doubleValue()>o.doubleValue()) {
		return -1;
		}else {
			return 0;
		}
	}

	@Override
	public int intValue() {
		
		return (int) doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long) doubleValue();
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)doubleValue();
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return numerator*1.0/denominator;
	}
	@Override
	public boolean equals(Object o) {
		return doubleValue()==((Rational)o).doubleValue();
	}

}
