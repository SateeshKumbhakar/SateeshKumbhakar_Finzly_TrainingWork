package HibernateCriteria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String  name;
	
	@Column(name="emp_salary")
	private String salary;
	
	@Column(name="emp_role")
	private String role;
	
	@Column(name="emp_exp")
	private int expInYear;
	
	public int getEmpId() {
		return empId;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", role=" + role + ", expInYear="
				+ expInYear + "]";
	}
	public Employee(int empId, String name, String salary, String role, int expInYear) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.expInYear = expInYear;
	}
	
   public Employee() {
	
}
	
	
	

}
