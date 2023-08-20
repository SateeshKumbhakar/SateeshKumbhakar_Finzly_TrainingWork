package oopsCodding.Inheritance.employee;

public class Developer extends Employee {
	
	String proLang;

	public Developer(String name, String proLang) {
		super(name);
		this.proLang = proLang;
	}
	
	public void showData() {
		System.out.println("EmpId= "+this.getId()+"\nEmpName= "+this.getName()+"\nproLang= " +this.proLang+"\n");
	}

}
