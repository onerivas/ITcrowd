import java.util.*;

public class EngineeringDepartment extends Department {
	
	public List<Team> listOfTeams = new ArrayList<Team>();
	int teamNumber = 1;
	int numberOfTeams = 0;
	String teamName = "Team_" + teamNumber;
		
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
		teamName = "Team_" + (teamNumber++);
		Team newTeam  = new Team(teamName); 		
		listOfTeams.add(newTeam);
		numberOfTeams++;
	}
	
	
	public void assignToTeam(Employee employeeToAssign)
	{
		if (numberOfTeams == 0 || listOfTeams.get(numberOfTeams - 1).getSize() > 6)
		{
			makeANewTeam();
			listOfTeams.get(numberOfTeams - 1).addMember(employeeToAssign);
		}
		else
		{
			listOfTeams.get(numberOfTeams - 1).addMember(employeeToAssign);
		}
	}
	
	public void removeFromTeam(Employee employeeToRemove)
	{
		
	}
	
	public String getTeams()
	{
		String teams = "";
		
		for (Team team: listOfTeams)
		{
			teams += team.getTeamName() + ", ";
		}
		
		return teams;
	}
	
	public String getTeam(int index)
	{
		return this.listOfTeams.get(index).getTeamName() + ": " + this.listOfTeams.get(index).getAllMembers();
	}
	
	public String getAllTeamsWithMembers()
	{
		String teams = ""; 
		
		for (int i = 0; i < listOfTeams.size(); i++)
		{
			teams += this.listOfTeams.get(i).getTeamName() + ": " + this.listOfTeams.get(i).getAllMembers()
;		}
		
		return teams;
		
		
	}

}
