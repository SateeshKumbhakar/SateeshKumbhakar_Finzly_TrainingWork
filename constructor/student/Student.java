package oopsCodding.constructor.student;

import java.util.Scanner;

public class Student {
   String name;
   int age;
   final int studentId;

   public Student() {
		super();
		this.name = "Unknown";
		this.age = 0;
		this.studentId = 0;
		
	}
   
   public Student(String name, int age, int studentId) {
	super();
	this.name = name;
	this.age = age;
	this.studentId = studentId;
	
   }
   void showDetails() {
	   System.out.println("Name= " +this.name + "\nAge =" + this.age+"\nSudentId= "+ studentId+"\n");
   }
   
   public static void main(String[] args) {
	
	   Student student1 = new Student();
	   student1.showDetails();
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Your Name ");	   
	   String name = sc.nextLine();
	   
	   System.out.println("Enter Your Age ");
	   int age = sc.nextInt();
	   
	   int studentId = (int)(Math.random()*100);
	   
	   Student student2 = new Student(name , age, studentId); 
	   student2.showDetails();   
}
   
}
