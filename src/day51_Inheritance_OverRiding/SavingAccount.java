package day51_Inheritance_OverRiding;

public class SavingAccount extends BankAccount {

//	String accountName;
//	long accountNumber;
//	double balance;

	double returnRate;

	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);
		this.balance = balance;
	}

	@Override
	public void deposit(int money) {

		this.balance += money;
		this.balance += 100;

	}

	@Override
	public void withdraw(int money) {

		this.balance -= money;
		this.balance -= 10;

	}
	
	public class BankAccount {

	
	String accountName;
	long accountNumber;
	double balance;
	
	
	public BankAccount(String accountName,long accountNumber,double balance) {
		
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
public void deposit(int money) {
		
		this.balance+=money;
				
	}
    public void withdraw(int money) {
		
		this.balance -= money;
				
	}
	
	
	public class BankAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1 = new SavingAccount("fatma",54645L,50000,5D);
		System.out.println(s1.balance);
		s1.deposit(50);
		System.out.println(s1.balance);

	}

	}
}
