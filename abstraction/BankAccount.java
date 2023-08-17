package oopsCodding.abstraction;

public abstract class BankAccount {

	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	public abstract String getAccountNumber();
	public abstract String getAccountHolderName();
	public abstract double getBalance();
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	
	}
	
	public void showDetails() {
		System.out.println("Account No = "+accountNumber+ "\n Account Holder's Name = "+ accountHolderName+"\n Balance = "+ balance+"\n");
	}
	
	
	
}
