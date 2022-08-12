import java.util.ArrayList;


public class Team {
	
	public String teamName;
	public int teamSize = 0;
	
	ArrayList<Employee> teamMembers = new ArrayList<Employee>();

	public Team() {
		
	}
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public void addMember(Employee newMember)
	{
		teamMembers.add(newMember);
		teamSize++;
	}
	
	public void removeMember(Employee memberToRemove)
	{
		teamMembers.remove(memberToRemove);
		teamSize--;
	}
	
	public int getSize()
	{
		return teamSize;
	}
	
	public String getAllMembers()
	{
		if(teamMembers.size() > 0){
			
			String allMembers = "";
			
			for (Employee member: teamMembers)
			{
				allMembers += member.getEmployeeInfo() + "\n";
			}
			
			return allMembers;
			
			 
		}
		else
		{
			return "No Team Members";
		}
		
	}
}
