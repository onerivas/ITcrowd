
public class Engineer extends Employee {
	
	private boolean onAProject;
	private String currentProject = "none";
	
	public Engineer(String currentProject)
	{
		this.currentProject = currentProject;
		this.onAProject = true;
	}
	
	public Engineer() {}
	
	public void setIfOnAProject(boolean areTheyOnAProject)
	{
		onAProject = areTheyOnAProject;
	}
	
	public boolean getOnAProject()
	{
		return onAProject;
	}
	
	public String getProjectName()
	{
		return currentProject;
	}
	
	public void setCurrentProject( String newProject)
	{
		currentProject = newProject;
	}
	
	public void setNoCurrentProject()
	{
		currentProject = "none";
	}

}
