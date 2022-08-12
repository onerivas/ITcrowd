import java.util.ArrayList;


public class Team implements SalaryInTimeRange {
	
	public String teamName;
	public int teamSize = 0;
	public int teamSalary = 0;
	
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
	
	public int getTeamSalary()
	{
		for (Employee member: teamMembers)
		{
			teamSalary += member.yearlySalary;
		}
		return teamSalary;
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

	public int dailySalary(int timePeriod) {
		
		return this.getTeamSalary()/timePeriod;
	}


	public int weeklySalary() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int monthlySalary() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int quarterlySalary() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int dailySalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
