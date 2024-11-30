package com.inheritance;
class Account{
	long accountNumber;
	double initialBalance;
	public Account(long accountNumber, double initialBalance) {
		super();
		this.accountNumber = accountNumber;
		this.initialBalance = initialBalance;
	}
	public void deposit(double amount) {
		System.out.println("The amount of which we want to deposite:"+(this.initialBalance+amount));
	}
	public void withdraw(double amount) {
		System.out.println("The amount which you want to withdraw:"+(this.initialBalance-amount));
	}
}
class SavingsAccount extends Account{
	double interestRate=1.5;
	public SavingsAccount(long accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		
	}
	

	public void addInterest() {
		System.out.println("Add inerest to the initial balsance:"+(initialBalance*interestRate));
	}
	
}
public class CheckingAccount extends Account {
	int overdraftLimit=2;
	public CheckingAccount(long accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		
	}
	public void withdrawche(double amount) {
		System.out.println("The amount "+amount+"is paid within"+overdraftLimit+"years");
	}
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(15040, 20000.500);
		sa.deposit(1200);
		sa.withdraw(2200);
		sa.addInterest();
		CheckingAccount ca=new CheckingAccount(20456, 15000.750);
		ca.deposit(1000);
		ca.withdraw(500);
		ca.withdrawche(100000);
	}

}
