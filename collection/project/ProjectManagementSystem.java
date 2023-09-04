package collections.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagementSystem {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        Map<String, Project> projects = new HashMap<>();

        while (true) {
            System.out.println("\nProject Management System");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member to Project");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Project Name: ");
                    String projectName = scanner.nextLine();
                    System.out.print("Enter Project Description: ");
                    String description = scanner.nextLine();
                    
                    System.out.print("Enter Project Description: ");
                    int durationTime = scanner.nextInt();
                    
                    Project newProject = new Project(projectName, description,durationTime);
                    projects.put(projectName, newProject);
                    System.out.println("Project added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Project Name to assign a team member: ");
                    String projectNameToAssign = scanner.nextLine();
                    Project projectToAssign = projects.get(projectNameToAssign);

                    if (projectToAssign != null) {
                        System.out.print("Enter Team Member Name: ");
                        String teamMember = scanner.nextLine();
                        projectToAssign.addTeamMember(teamMember);
                        System.out.println("Team member assigned successfully.");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Project Name to view details: ");
                    String projectNameToView = scanner.nextLine();
                    Project projectToView = projects.get(projectNameToView);

                    if (projectToView != null) {
                        System.out.println(projectToView);
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;
                case 4:
                    System.out.println("List of All Projects:");
                    for (Project p : projects.values()) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}
