package oopsCodding.encapsulationAcessControl;

public class BankAccount {
	private long accountNumber;
	private long balance;
	private String ownerName;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public  long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	public BankAccount(long accountNumber, long balance, String ownerName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public void showAccountDetails() {
		
		System.out.println("**********");
		System.out.println("Your Account Details...\n "+ "Account Number = "+ accountNumber + "\n "+"Your Name = "+ownerName +" \n Balance = "+ balance);
	    System.out.println("**********");
	}
	
	public void deposit(long amount) {
		if(amount > 0) {
		 System.out.println(" Deposit Successful of = "+amount );
		 long balance = this.getBalance();
		 balance +=amount;
	     this.setBalance(balance);
		}
		
		else System.out.println("you cann't Deposit of ="+ amount);
	}
	
	public void withdraw (long amount) {
		
		if(balance > 0 && balance >= amount) {
		System.out.println("withdrawal Successful of = "+amount );
		long balance = this.getBalance();
		
		balance -=amount;
		this.setBalance(balance);
		}
		
		else System.out.println("Not eligible for this transaction of "+amount+"Rs");
		
	}
	
	
	
	

}
