package collections.bank;

import java.util.ArrayList;

public class Bank {
	
	 
	static ArrayList<Customer> accountHolder = new ArrayList<>();
	
	public ArrayList<Customer> getAllAcntHolders(){
		return accountHolder;
	}
	
	

	public void createAccount(String customerName ,int age,String accountType, double bal) {	
		  
		   Account account = new Account(accountType,bal);
		   accountHolder.add(new Customer(customerName,age,account));
		   
		}
		
	
	public static void main(String[] args) {
		Bank bank  = new Bank();
		
		bank.createAccount("Sateesh",22,"Saving",1000);
		bank.createAccount("Ravi",25,"Saving",6000);
		bank.createAccount("Raj",22,"current",3000);
		bank.createAccount("praveen",22,"Saving",30);
		bank.createAccount("Sahid",22,"current",100);
		
		for (Customer cstm : accountHolder) {
			System.out.println(cstm);
		}
		
		
		 Customer customer= accountHolder.get(0);
		 System.out.println(customer.getAccount().checkBalance());
		 customer.getAccount().deposit(1000);
		 customer.getAccount().withdraw(500);
         System.out.println(customer.getAccount().checkBalance());
		 
		
		 
	}
}
