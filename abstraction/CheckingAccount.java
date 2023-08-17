package oopsCodding.abstraction;

public class CheckingAccount extends BankAccount {
    private double overDraftLimit;
	
    
	
	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overDraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overDraftLimit = overDraftLimit;
		this.showDetails();
	}
	

	public double getOverDarftLimit() {
		return overDraftLimit;
	}

	public void setOverDarftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
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
		
		if(this.getBalance()- amount >= - overDraftLimit) {
			
		   double tempBalance = this.getBalance()-amount;
			this.setBalance(tempBalance);
		}
		else {
			System.out.println("For Cheching Acount=> Insufficient Fund ! ");
		}
		
		System.out.println("Checking A/c Balance = "+ this.getBalance());
		return 0;
		
	}

}
