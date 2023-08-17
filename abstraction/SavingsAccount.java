package oopsCodding.abstraction;

public class SavingsAccount extends BankAccount {

	private double interestRate; 
	
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
		this.showDetails();
	}
	
	
	@Override
	public String getAccountNumber() {
		
		return super.accountNumber;
	}

	@Override
	public String getAccountHolderName() {
		
		return super.accountHolderName;
	}

	@Override
	public double getBalance() {
		
		return super.balance;
	}
	
	@Override
	public double deposit(double amount) {
		
		if( amount> 0 ) {
			double tempBalance = super.balance+amount;
			this.setBalance(tempBalance);
		}
		
//		return super.balance;
		return this.getBalance();
		
	}

	@Override
	public double withdraw(double amount) {
		
		if(this.getBalance() >=amount) {
			
		   double tempBalance = this.getBalance()-amount;
			this.setBalance(tempBalance);
		}
		
		System.out.println("Savings Balance = "+ this.getBalance());
		return 0;
	}

	
	

}
