package tut1;

import java.util.ArrayList;

public class PrimeF {
	private int prime = 2;

	public PrimeF(int prime) {
		this.prime = prime;
	}

	public void setPrime(int prime) {
		this.prime = prime;
	}

	public int getPrime() {
		return prime;
	}

	public ArrayList<Integer> Primes() {
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (int j = 1; j <= this.prime; j++) {
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2 && j > 1) {
				list.add(j);
			}
			count = 0;
		}
		return list;
	}

	public ArrayList<Integer> factorization() {
		ArrayList<Integer> list = Primes();
		ArrayList<Integer> list2=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
		while(prime%list.get(i)==0&&prime/list.get(i)!=0) {
			list2.add(list.get(i));
			prime=prime/list.get(i);
			
		}

			}
			
		
		return list2;
	}
}
