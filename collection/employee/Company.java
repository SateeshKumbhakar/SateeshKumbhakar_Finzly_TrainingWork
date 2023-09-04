package collections.employee;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee e1 = new Employee(101,"Sateesh",12345,"development");
 		Employee e2 = new Employee(102,"Ravi",12345,"manager");
 		Employee e3 = new Employee(103,"Sashi",12345,"consultant");
 		Employee e4 = new Employee(104,"Praveen",12345,"account");
 		Employee e5 = new Employee(105,"balaji",12345,"Hr");
 		Employee e6 = new Employee(106,"jivan",12345,"sales");
		
 		emp.addEmployee(e1);
 		emp.addEmployee(e2);
 		emp.addEmployee(e3);
 		emp.addEmployee(e4);
 		emp.addEmployee(e5);
 		emp.addEmployee(e6);
 	
 		
 	    emp.showEmployeeDetails(emp.getAllEmp());
 	    System.out.print("Find by Id");
 	    System.out.println(" "+ emp.searchEmployee(emp.getAllEmp(),101));
 	    
 		
 			
 		
		 
	}
	

}
