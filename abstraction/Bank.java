package oopsCodding.abstraction;

public class Bank {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("12345678", "Sateesh Kumbhakar", 4563.00, 5);
		CheckingAccount checkingAccount = new CheckingAccount("87654321", "Ravi Sharma", 5563.00,10000.00);
	     double balance = savingsAccount.withdraw(100);
	     
	     checkingAccount.withdraw(2000);
	     
	    
	}

}
