package tut1;

public class ATMMachine {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private java.util.Date dateCreated=new java.util.Date();
	
public	ATMMachine() {
	
}
public ATMMachine(int id, double balance) {
	this.id=id;
	this.balance=balance;
}
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public double getBalance() {
	return ((int)balance*100)/100.0;
}

public java.util.Date getDate(){
	return this.dateCreated;
}
public void setAnnualInterestRate(double AnnualInterestRate) {
	this.annualInterestRate=AnnualInterestRate;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public double getMonthlyInterestRate() {
	return annualInterestRate/12;
}

public double getMonthlyInterest() {
	return getMonthlyInterestRate()*balance/100;
}

public double withdraw(double withdraw) {
	if(balance-withdraw>=0) {
		balance-=withdraw;
	}
	return ((int)balance*100)/100.0;
}

public double deposit(double deposit) {
	balance+=deposit;
	return ((int)balance*100)/100.0;
}




}
