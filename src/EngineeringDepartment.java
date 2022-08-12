import java.util.*;

public class EngineeringDepartment extends Department {
	
	public List<Team> listOfTeams = new ArrayList<Team>();
	String teamName = "Team_" + listOfTeams.size() + 1;
		
	public EngineeringDepartment(List<Employee> members)
	{
		super(members);
	}
	
	public EngineeringDepartment()
	{
		
	}
	
	public String getTeamName()
	{
		
		return teamName = "Team " + listOfTeams.size() + 1; 
	}
	
	public void makeANewTeam()
	{
		Team newTeam  = new Team(teamName); 
		listOfTeams.add(newTeam);
	}
	
	
	public void assignToTeam(Employee employeeToAssign)
	{
		if (listOfTeams.size() == 0 || listOfTeams.get(listOfTeams.size() - 1).getSize() > 6)
			makeANewTeam();		
		else
		{
			listOfTeams.get(listOfTeams.size() - 1).addMember(employeeToAssign);
		}
	}

}
