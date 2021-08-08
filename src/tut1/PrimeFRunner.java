package tut1;

import java.util.ArrayList;

public class PrimeFRunner {

	public static void main(String[] args) {
		
//		PrimeF prime=new PrimeF(120);
//		System.out.println(prime.Primes().size());
//		System.out.println(prime.Primes());
//		System.out.println(prime.Primes().get(5));
//		System.out.println(prime.factorization());
	
	
	ArrayList<Integer> list3=new ArrayList<>();
	
	long num=11234;
	int i=2;
	while (i<=num) {
		if(num%i==0) {
			list3.add(i);
			num/=i;
		}else {
		i++;}
	}
	
	System.out.println(list3.toString());
	PrimeF num1=new PrimeF(11234);
	System.out.println(num1.factorization());
	
	}

}
