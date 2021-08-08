package tut1;

public class PracticeClass01 {
public static void main(String[] args) {
	
	String a="AvdvsdfgerwefAvdfg";
	String b="";
	int c=0;
	for(int i=0;i<a.length();i++) {
		for(int j=0;j<a.length();j++) {
			if(a.charAt(i)==a.charAt(j)&&a.charAt(i)!=' ') {
				c++;
				
			}
			
		}
		b+=a.charAt(i)!=' '?""+a.charAt(i)+c:"";
		a=a.replace(Character.toString(a.charAt(i))," ");
		c=0;
	}
	System.out.println(b);
}
}
