package oopsCodding.Inheritance.employee;

public class Main {

	public static void main(String[] args) {
		
		 Manager manager = new Manager("Sanju", "Sale");
		 Developer developer = new Developer("SK", "Develpoment");
		
		manager.showData();
		developer.showData();
	}
	
}

