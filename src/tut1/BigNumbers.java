package tut1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigNumbers {
public static void main(String[] args) {
	
	
//	String x=""+1;
//	for(int i=0;i<50;i++) {
//		x+="0";
//	}
//	BigDecimal bigNum=new BigDecimal(x);
//	BigDecimal bigNum1=new BigDecimal("3");
//	BigDecimal bigNum2=new BigDecimal("2");
//	System.out.println(x);
//	List<BigDecimal> list=new ArrayList<>();
//	list.add(bigNum);
//	
//	list.add(bigNum.add(bigNum1));
//	
//	
//	int i=0;
//	while(list.size()<10) {
//	BigDecimal y=new BigDecimal(i);
//	if(bigNum.add(y).divideAndRemainder(bigNum1)[1]==BigDecimal.ZERO||bigNum.add(y).divideAndRemainder(bigNum2)[1]==BigDecimal.ZERO) {
//		list.add(bigNum.add(y));
//	}
//	i++;
//	}
//	
//	System.out.println(list);
//	
//	System.out.println(list.get(0).compareTo(list.get(2)));

	
//	long x=Long.MAX_VALUE;
//	BigInteger big=new BigInteger(""+x);
//	BigInteger big2=big.sqrt();
	
//	
//	List<BigInteger> list=new ArrayList<>();
//	
//	
//	
//	long i=0;
//	while(list.size()<10) {
//	BigInteger y=new BigInteger(""+big2+i);
//	if(y.pow(2).compareTo(big)==1) {
//		list.add(y.pow(2));
//	}	
//	i++;
//	}
//	System.out.println(list);
	
	BigInteger x=new BigInteger(""+Long.MAX_VALUE);
	List<BigInteger> list=new ArrayList<>();
	
	int i=0;
	
	while(list.size()<5) {
		BigInteger y=new BigInteger(""+i);
		if(x.add(y).isProbablePrime(100)) {
			list.add(x.add(y));
		}
		i++;
	}
	System.out.println(list);
	
	
	
	
}
}

