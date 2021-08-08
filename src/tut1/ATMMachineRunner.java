package tut1;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMMachineRunner {

	public static void main(String[] args) {
//		ATMMachine account=new ATMMachine(1,20000);
//		
//	System.out.println(account.getBalance());
//		System.out.println(account.withdraw(3001));
//
//		System.out.println(account.deposit(2500));
	ATM();
		
		
		
	}
public static void ATM() {
	Scanner in=new Scanner(System.in);
	ArrayList<ATMMachine> list=accounts();
	System.out.println("Id?");
	int id=in.nextInt();
	if(id>=0&&id<=9) {
		System.out.println("Menu");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3; Deposit");
		System.out.println("4:Exit");
		int choice=in.nextInt();
		switch(choice) {
		case 1: System.out.println(list.get(id).getBalance());
		ATM();
		break;
		case 2:
		System.out.println("how much will you withdraw?");
		double withdraw=in.nextDouble();
		while(list.get(id).getBalance()-withdraw<0) {
			System.out.println("unsufficient Balance Try again!");
			withdraw=in.nextDouble();
		}
		System.out.println("Witdraw: -"+withdraw);
		System.out.println("New Balance: "+list.get(id).withdraw(withdraw));
		accounts().get(id).withdraw(withdraw);
		ATM();
		break;
		case 3:
			System.out.println("How much do you wish to deposit?");
			double deposit=in.nextDouble();
			System.out.println("Deposit amount: $"+deposit);
			System.out.println("New Balance: $"+list.get(id).deposit(deposit));
			ATM();
			break;
		case 4:
			ATM();
			break;
		}
	} else {
		System.out.println("There is no account with the entered ID: "+id);
		ATM();
	}
	
	
	
	
	
}
public static ArrayList<ATMMachine> accounts(){
	ArrayList<ATMMachine> list=new ArrayList<>();
	for(int i=0;i<10;i++) {
		list.add(new ATMMachine(i,100));
	}
	return list;
}

}
