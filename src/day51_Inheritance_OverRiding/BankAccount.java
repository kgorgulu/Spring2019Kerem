package day51_Inheritance_OverRiding;

public class BankAccount {

String accountName; 
long accountNumber; 
double balance;
	
	
	public BankAccount(String accountName, long accountNumber, double balance) {
	super();
	this.accountName = accountName;
	this.accountNumber = accountNumber;
	this.balance = balance;
}


	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	public double deposit(int a) {
		
		return this.balance +=a; 
	}
	public double withdraw(int b) {
		
		return this.balance +=b; 
	}
 
	public static void main(String[] args) {
		

	}

}
public class SavingAccount extends BankAccount {

	double returnRate; 
	
	
	public SavingAccount(String accountName, long accountNumber, double balance, double returnRate) {
		super(accountName, accountNumber, balance);
		this.returnRate = returnRate;
	}
    
	public double deposit(int s) {
		
		return this.balance += s+100;
	}
     public double withdraw(int q) {
		
		return this.balance += q-10;
	}
	

	public static void main(String[] args) {

	}
}
