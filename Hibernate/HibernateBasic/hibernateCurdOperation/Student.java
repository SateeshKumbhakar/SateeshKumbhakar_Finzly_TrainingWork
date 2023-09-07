package hibernateCurdOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @Column(name = "student_id")
	private int studentId;
    private String name;
    private int std;
    private String course;
    
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int studentId, String name, int std, String course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.std = std;
		this.course = course;
	}
	public Student() {}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", std=" + std + ", course=" + course + "]";
	}
    
    
}
