package tut1;

public class MyInteger {
private int value;

public MyInteger(int value) {
	this.value=value;
}

public int getValue() {
	return this.value;
}

public boolean isEven() {
	if(value%2==0) {
		return true;
	}else {
		return false;
	}
}

public boolean isOdd() {
	if(value%2==1) {
		return true;
	}else {
		return false;
	}
}

public boolean isPrime() {
	int max=value/2;
	
	int divisors=0;
	for(int i=1;i<max;i++) {
		if(value%i==0) {
			divisors++;
		}
	}
	if(divisors>1) {
		return true;
	}else {
		return false;
	}
}

public boolean isEqual(int num) {
	if(num==this.value) {
		return true;
	}else {
		return false;
	}
}

public static int parseInt(char[] chars) {
	return Integer.parseInt(String.valueOf(chars));
}
public static int parseInt(String string) {
	return Integer.parseInt(string);
}


}
