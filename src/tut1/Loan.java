package tut1;

import java.io.Serializable;
import java.time.LocalDate;

public class Loan implements Serializable {

private static final long serialVersionUID = 1L;
private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
private LocalDate dateCreated;
public Loan() {

}
public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
	super();
	this.annualInterestRate = annualInterestRate;
	this.numberOfYears = numberOfYears;
	this.loanAmount = loanAmount;
	dateCreated=LocalDate.now();
}
@Override
public String toString() {
	return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount="
			+ loanAmount + ", dateCreated=" + dateCreated + ", getMonthlyPayment()=" + getMonthlyPayment()
			+ ", getTotalPayment()=" + getTotalPayment() + "]";
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}
public int getNumberOfYears() {
	return numberOfYears;
}
public void setNumberOfYears(int numberOfYears) {
	this.numberOfYears = numberOfYears;
}
public double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}
public LocalDate getDateCreated() {
	return dateCreated;
}
public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}

public double getMonthlyPayment() {
	double monthlyInterestRate=this.annualInterestRate/1200;
	double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			 (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
			 return monthlyPayment; 
}

public double getTotalPayment() {
	double totalPayment=this.getMonthlyPayment()*numberOfYears*12;
	return totalPayment;
}





}
