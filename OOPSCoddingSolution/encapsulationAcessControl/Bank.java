package oopsCodding.encapsulationAcessControl;

public class Bank {
	public static void main(String[] args) {
		BankAccount bankAccount1  = new BankAccount(123456,50000,"Sateesh Kumbhakar");
		bankAccount1.showAccountDetails();		
		System.out.println();
		
		bankAccount1.deposit(10000);
		bankAccount1.showAccountDetails();
		
		System.out.println();
		bankAccount1.withdraw(20000);
		bankAccount1.showAccountDetails();
		
		BankAccount bankAccount2  = new BankAccount(654321,5000,"Ravi Sharma");
		bankAccount2.showAccountDetails();		
		System.out.println();
		
		bankAccount2.deposit(1000);
		bankAccount2.showAccountDetails();
		
		System.out.println();
		bankAccount2.withdraw(30000);
		bankAccount2.showAccountDetails();
	}

}
