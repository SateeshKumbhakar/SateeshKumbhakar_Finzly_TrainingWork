package collections.employee;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	private int empId;
	private String name;
	private  double salary;
	private String dept;
	public int getEmpId() {
		return empId;
	}
	public Employee(){
		
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(int empId, String name, double salary, String dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	ArrayList<Employee> employeeList = new ArrayList<>();
	
	
	// Operation 
	// Show Employees Details
	public void showEmployeeDetails(ArrayList<Employee> employeeList) {
		System.out.println("Employee Detail");
		if(employeeList.size()<=0)
			System.out.println("No employee is added.");
		else 
			for (Employee employee : employeeList) 
				System.out.println(employee);
				
	}
	// add Employee
	public  void addEmployee(Employee emp) {
		if(emp!= null)
			employeeList.add(emp);
		else
			System.out.println("Please add valid data.");
		
	}
	// search Employee
	public Employee searchEmployee(ArrayList<Employee> list,int empId){
		 
		for (Employee employee : list) {
			if(employee.getEmpId()== empId)
				return employee;
			else
				System.out.println("Emp not Found.");
		}
		return null;
	}
	
	public ArrayList<Employee> getAllEmp(){
		return employeeList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
