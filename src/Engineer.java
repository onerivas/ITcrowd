
public class Engineer extends Employee {
	
	private boolean onAProject = false ;
	private String currentProject = "Not on a project";
	
	public Engineer(String name, String department, String seniority, int yearlySalary)
	{
		super(name, department, seniority, yearlySalary);
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
	
	
	@Override
	public String getEmployeeInfo()
	{
		return super.getEmployeeInfo() + ", Currently on a Project: " + onAProject + ", Project Name: " + currentProject;
	}

}
