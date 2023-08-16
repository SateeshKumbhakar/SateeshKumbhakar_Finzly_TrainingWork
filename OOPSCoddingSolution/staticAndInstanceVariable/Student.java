package oopsCodding.staticAndInstanceVariable;

public class Student {
  private int studentID;
  private String name;
  private static int totalStudents=0;

 public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static int getTotalStudents() {
	return totalStudents;
}
public static void setTotalStudents(int totalStudents) {
	Student.totalStudents = totalStudents;
}
public Student(int studentID, String name) {
	super();
	this.studentID = studentID;
	this.name = name;
}
  
 
public void enrollStudent(Student student) {
	 int  st = Student.getTotalStudents();
	 
	Student.setTotalStudents(++st);
}
  


public void dropStudent(Student student) {
	
	int  st = Student.getTotalStudents();
	Student.setTotalStudents(--st);
	student = null;
}

  
}
