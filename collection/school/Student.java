package collections.school;

public class Student {

  private String studentName;
  private  int rollNo;
  private int stduentStd;
  
public  Student() {
}


public Student(String studentName, int rollNo, int stduentStd) {
	super();
	this.studentName = studentName;
	this.rollNo = rollNo;
	this.stduentStd = stduentStd;
	
}


public String getstudentName() {
	return studentName;
}
public void setstudentName(String studentName) {
	this.studentName = studentName;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public int getStduentStd() {
	return stduentStd;
}
public void setStduentStd(int stduentStd) {
	this.stduentStd = stduentStd;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", stduentStd=" + stduentStd + "]";
}


	
}
