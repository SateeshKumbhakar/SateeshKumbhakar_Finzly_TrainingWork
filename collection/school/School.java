package collections.school;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
 
 	static ArrayList<Teacher> teachers = new ArrayList<>();
	static ArrayList<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		boolean flag = false;
		do{
			
			System.out.println("\nAdd Teacher 1");
			System.out.println("Add Student 2");
			System.out.println("show Teachers 3");
			System.out.println("show Students 4");
			System.out.println("exit 5");
			
			System.out.println("Enter choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
                System.out.println("Enter Teacher Name");
                sc.nextLine();
				String name = sc.nextLine();
				
				System.out.println("Enter Teacher Salary");
				double salary =sc.nextDouble();
				
				teachers.add(new Teacher(name,salary));
				flag =true;
				break;
			case 2:
				System.out.println("Enter name");
				sc.nextLine();
				String sName = sc.nextLine();
				System.out.println("Enter roll No");
				int rollNo = sc.nextInt();
				System.out.println("Enter Standard of student");
				int std  = sc.nextInt();
				
     			students.add(new Student());
				flag =true;
				break;
			case 3:
				showTeacher();
				flag =true;
				break;
			case 4:
				showStudent();
				flag =true;
				break;

			default:
				System.out.println("Exited");
	            flag =false;			
				break;
			}
			
			
		}while(flag);
	}
	
	
	public static void showStudent() {
		System.out.println("Student are Here..");		
		for(Student student : students) {
			System.out.println(student);
		}
	}
	public static void showTeacher() {
		System.out.println("Teacher are Here..");
		for(Teacher teacher : teachers) {
			
			System.out.println(teacher);
		}
	}
}
