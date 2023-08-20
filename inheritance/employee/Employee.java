package oopsCodding.Inheritance.employee;

import java.util.UUID;

public class Employee {
	 
        private String id = generateUniqueId();
        private String name;
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
     

	public Employee(String name) {
		super();
		this.name = name;
	}

	//Method to Generate UniqueId
	public static String generateUniqueId() {
                 // UUID uniqueId = UUID.randomUUID();	
		return UUID.randomUUID().toString();
	}
	
	
 
}
