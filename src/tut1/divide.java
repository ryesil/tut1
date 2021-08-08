package tut1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class divide {

	public static void main(String[] args) {

		BigInteger x=new BigInteger(""+Long.MAX_VALUE);
		
		List<BigInteger> list=new ArrayList<>();
		int i=1;
		BigInteger z=new BigInteger("5");
		BigInteger t=new BigInteger("6");
		while(list.size()<11) {
			BigInteger y=x.add(new BigInteger(""+i));
			if(y.divideAndRemainder(z)[1].equals(new BigInteger("0"))||y.divideAndRemainder(t)[1].equals(new BigInteger("0"))) {
				list.add(y);
			}
			i++;
		}
		System.out.println(list);
	String a=list.get(2).toString();
	int sum=0;
	for(int j=0;j<a.length();j++) {
		sum+=Integer.parseInt(a.substring(j, j+1));
		
		
	}
		System.out.println(sum);
		
		
		

	}

}
