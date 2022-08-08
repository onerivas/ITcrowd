import java.util.ArrayList;

public class ProjectManager {

	private ArrayList<String> currentProjects = new ArrayList<String>();
	
	 public ProjectManager() {}

	 public ProjectManager(ArrayList<String> currentProjects)
	 {
		 this.currentProjects = currentProjects;
	 }
	 
	 public String getCurrentProjects()
	 {
		 return currentProjects.toString();
	 }
}
