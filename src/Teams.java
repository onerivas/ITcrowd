import java.util.ArrayList;


public class Teams {
	
	String teamName;
	ArrayList<Employee> teamMembers = new ArrayList<Employee>();

	public Teams() {
		
	}
	
	public Teams(String teamName, ArrayList<Employee> teamMembers) {
		this.teamName = teamName;
		this.teamMembers = teamMembers;
	}
}
