import java.util.ArrayList;


public class Team implements SalaryInTimeRange {
	
	public String teamName;
	public int teamSize = 0;
	
	ArrayList<Employee> teamMembers = new ArrayList<Employee>();

	public Team() {
		
	}
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public String getTeamName()
	{
		return teamName;
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

	@Override
	public int dailySalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int weeklySalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int monthlySalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quarterlySalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
