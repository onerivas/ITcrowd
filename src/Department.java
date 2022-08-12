import java.util.ArrayList;

public abstract class Department {
	
	private ArrayList<Employee> members = new ArrayList<Employee>();
	

	public Department(ArrayList<Employee> members) {
		this.members = members;
	}
	
	public Department()
	{
		
	}
	
	public int getDepartmentYearlySalary()
	{
		int departmentYearlySalary = 0;
		
		for (int i = 0; i < members.size() - 1; i++)
		{
			departmentYearlySalary += members.get(i).getSalary();
		}
		
		return departmentYearlySalary;
	}
	
	public String getAllMembers()
	{
		String allMembers = "";
		
		for (int i = 0; i < members.size() - 1; i++)
		{
			allMembers += members.get(i).getName() + " ";
		}
		
		allMembers = "[ " + allMembers.substring(0, members.size() - 1) + "]";
		
		return allMembers; 
	}
	
	public void addMember(Employee newMember)
	{
		members.add(newMember);
	}
	
	public void removeMember(Employee memberToRemove)
	{
		members.remove(memberToRemove);
	}

}
