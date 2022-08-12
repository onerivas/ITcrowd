
public class Main 
{
	
	public static void main(String[] args)
	{
		Engineer jRivas = new Engineer("Juan Rivas", "Engineering", "Junior", 80000);
		
		System.out.println(jRivas.weeklySalary());
		System.out.println(jRivas.getEmployeeInfo());
		
		EngineeringDepartment engineering = new EngineeringDepartment();
		
		System.out.println(engineering.getAllMembers());
		engineering.addMember(jRivas);
		System.out.println(engineering.getAllMembers());
		System.out.println(engineering.getDepartmentYearlySalary());
		
		Engineer rRivas = new Engineer("Robin Rivas", "Engineering", "Junior", 80000);
		
		engineering.addMember(rRivas);
		//System.out.println(engineering.getAllMembers());
		//System.out.println(engineering.getDepartmentYearlySalary());
		
		
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		engineering.assignToTeam(jRivas);
		engineering.assignToTeam(rRivas);
		
		System.out.println(engineering.getTeam(0));
		System.out.println(engineering.getTeams());
		System.out.println(engineering.getAllTeamsWithMembers());
		
		
		
		
		
		/*CEO Azteca = new CEO("Azteca", "Leadership", "Partner", 340000000);
		
		Azteca.fireDepartment(engineering);
		
		System.out.println(engineering.getAllMembers());
		
		*/
	
	
	
	
	}		
}
