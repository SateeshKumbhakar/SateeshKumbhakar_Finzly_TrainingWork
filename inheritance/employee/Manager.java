package oopsCodding.Inheritance.employee;

public class Manager extends Employee {
	String department;

	public Manager(String name, String department) {
		super(name);
		this.department = department;
	}
	
	public void showData() {
		System.out.println("EmpId= "+this.getId()+"\nEmpName= "+this.getName()+"\nDepartment= " +this.department+"\n");
	}

}
