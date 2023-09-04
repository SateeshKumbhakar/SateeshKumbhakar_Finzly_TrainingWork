package collections.bank;

import java.util.ArrayList;

public class Customer {

	
	public Customer() {
		
	}
 	private String customerName;
 	private int age;
 	private Account account;
 	
	public Customer(String customerName, int age, Account account) {
		super();
		this.customerName = customerName;
		this.age = age;
		this.account = account;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	ArrayList<Customer> accountHolder = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", age=" + age + ", account=" + account + "]";
	}

	
	
	
 	
}
