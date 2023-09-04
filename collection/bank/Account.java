package collections.bank;

public class Account {
    public Account() {
    	
    }
    static  long setterAct= 123450001;
	private  long accountNo;
	private String accountType;
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(String accountType,double balance ) {
		super();
		this.accountNo = setterAct++;
		this.accountType = accountType;
		this.balance = balance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	 
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [ AccountNo " + accountNo + ", accountType=" + accountType + ", balance=" + balance +  "]";
	}
	
	//Deposit here
		public double deposit(double balance) {
	
			System.out.println("Deposit "+ balance +"TotalBal "+ getBalance());
			double temp = getBalance();
		     setBalance(balance+temp);
			
			return getBalance();
		} 
		
		//Withdraw here
			public double withdraw(double balance) {
			
			double temp = getBalance();
			if(temp>= balance) {
			 System.out.println("Withdraw "+ balance +"TotalBal "+ getBalance());
			 setBalance(temp - balance);
			 
			}else {
				System.out.println("Withdrawal Not possible");
			}
			
			
			return getBalance();
		}
		
		//Check balance
		public double checkBalance() {	
			System.out.print("check Balance ");
			return getBalance();
		}
	
	
	
}
