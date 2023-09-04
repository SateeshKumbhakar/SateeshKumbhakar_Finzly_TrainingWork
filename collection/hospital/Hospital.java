package collections.hospital;

import java.util.HashMap;
import java.util.Scanner;


public class Hospital {

	static HashMap< Integer,Patient> patients = new HashMap<>();
	private static int temp =100;

	public static void main(String[] args) {
		boolean flag = false;
	
		do{
			
			System.out.println("\nAdd Patient 1");
			System.out.println("View patient Details 2");
			System.out.println("View all patients 3");
			System.out.println("Serach Patient 4");
			System.out.println("exit 5");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
                System.out.println("Enter Patient Name");
                sc.nextLine();
				String name = sc.nextLine();
				
				System.out.println("Enter age ");
				int age =sc.nextInt();
				
				System.out.println("Enter Patient gender");
				
				String gender = sc.nextLine();
				
				System.out.println("Enter Patient bloodTpye");
				String bloodType = sc.nextLine();
				
				patients.put(temp++,new Patient(name,age,gender,bloodType));
				flag =true;
				break;
			
			
			case 2:
				int id = sc.nextInt();
				showPatientDetail(id);
				flag =true;
				break;
			case 3:
				showPatients();
				flag =true;
				break;
			
			case 4:
			   System.out.println("Enter Id Of Patient");
			   int PId= sc.nextInt();
			   serachPatient(PId); 	
			   break;
			case 5:
				System.out.println("Exited");
				sc.close();
				System.exit(0);	
				break;

			default:
				System.out.println("Invaid Choice");
	            flag =false;			
				break;
			}
				
		}while(flag);
				
	}


	private static void serachPatient(int id) {	
		for(int ids: patients.keySet()) {
			if(ids ==id) {
				System.out.println(patients.get(ids));
			}
			else
				System.out.println("patient with given id is not Found");
		}
		
	}
	private static void showPatients() {
		System.out.println("Show All Patients");	 
		for( int id : patients.keySet()) {
			if(patients.size()< 1) {
				System.out.println("No Patient Found");
			}
			else
			  System.out.println("Key"+id +" "+patients.get(id));
		}
	}
	private static void showPatientDetail(int id) {
		Patient patient = patients.get(id);
		if(patient!=null) {
			System.out.println("Show All Details of Patient..");
			System.out.println(patient);
		}
		else 
			System.out.println("Patient not found for given id");
	}
	
	
}

