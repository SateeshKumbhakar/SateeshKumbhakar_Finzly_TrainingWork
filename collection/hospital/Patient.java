package collections.hospital;

public class Patient {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private String bloodType;
	public Patient() {}
	

	public Patient(String name, int age, String gender, String bloodType) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodType = bloodType;
	}
    
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}


	@Override
	public String toString() {
		return "Patient ["+", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", bloodType=" + bloodType + "]";
	}
	
	
	
	
	
}
