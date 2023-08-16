package oopsCodding.staticAndInstanceVariable;

public class StudentDriver {
	public static void main(String[] args) {
		Student student = new Student(101,"Sateesh");
		
		// Enroll Student
		student.enrollStudent(student);		
		System.out.println("student Enrolled " + Student.getTotalStudents());
		
		// Drop Student
		student.dropStudent(student);
		System.out.println("Total student  " + Student.getTotalStudents());
		
	}
	

}
