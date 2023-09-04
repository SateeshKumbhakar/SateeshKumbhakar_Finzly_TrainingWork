package collections.project;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Project {
	private String projectName;
    private String description;
    private int durationTime;
    private Set<String> teamMembers;

    public Project(String projectName, String description,int durationTime) {
        this.projectName = projectName;
        this.description = description;
        this.durationTime = durationTime;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getTeamMembers() {
        return Collections.unmodifiableSet(teamMembers); // Prevent direct modification
    }

    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }

    @Override
    public String toString() {
        return "Project Name: " + projectName + "\nProject Description: " + description + "\n Project Duration"+ durationTime
               + "\nTeam Members: " + teamMembers;
    }

}

