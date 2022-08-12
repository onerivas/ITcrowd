import java.util.*;

public abstract class Department implements SalaryInTimeRange {
	
	public List<Employee> members = new ArrayList<Employee>();
	public int departmentSize = 0;
	

	public Department(List<Employee> members) {
		this.members = members;
		this.departmentSize = members.size();
	}
	
	public Department()
	{
		
	}
	
	public int getDepartmentYearlySalary()
	{
		int departmentYearlySalary = 0;
		
		if(members.size() > 0){
			
			
			for (Employee member: members)
			{
				departmentYearlySalary += member.getSalary();
			}
			
			 
		}
			return departmentYearlySalary;
		}
	
	
	public String getAllMembers()
	{
		if(members.size() > 0){
			
			String allMembers = "";
			
			for (Employee member: members)
			{
				allMembers += member.getEmployeeInfo() + "\n";
			}
			
			return allMembers;
			
			 
		}
		else
		{
			return "No Employees in this department";
		}
		
	}
	
	public void addMember(Employee newMember)
	{
		members.add(newMember);
		departmentSize++;
	}
	
	public void removeMember(Employee memberToRemove)
	{
		members.remove(memberToRemove);
		departmentSize--;
	}
	
	public int dailySalary()
	{
		return getDepartmentYearlySalary()/DAYS_IN_A_YEAR;
	}
	
	public int weeklySalary()
	{
		return getDepartmentYearlySalary()/WEEKS_IN_A_YEAR;
	}
	
	public int monthlySalary()
	{
		return getDepartmentYearlySalary()/MONTHS_IN_A_YEAR;
	}
	
	public int quarterlySalary()
	{
		return getDepartmentYearlySalary()/3;
	}

	public void removeAll() {
		members.clear();
		
	}

}
