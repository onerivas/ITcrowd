
public class Client {
	
	public String clientName;
	public String currentProjectName;
	
	public Client (String name, String project)
	{
		this.clientName = name;
		this.projectName = project;
	}
	
	public Client() {}
	
	public String getName()
	{
		return clientName;
	}
	public void setName(String name)
	{
		clientName = name;
	}
	
	

}
