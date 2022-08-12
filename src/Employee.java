
public abstract class Employee implements SalaryInTimeRange {
	
		public String name;
		public String department;
		public String seniority;
		int yearlySalary;

	Employee(String name, String department, String seniority, int yearlySalary) {
		this.name = name;
		this.department = department;
		this.seniority = seniority;
		this.yearlySalary = yearlySalary;
	}
	
	public Employee()
	{
		
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getSeniority()
	{
		return seniority;
	}
	
	public void setSeniority( String newSeniority)
	{
		seniority = newSeniority;
	}
	
	public int getSalary()
	{
		return yearlySalary;
	}
	
	
	public void setYearlySalary(int newSalary)
	{
		yearlySalary = newSalary;
	}
	
	public int dailySalary()
	{
		return yearlySalary/DAYS_IN_A_YEAR;
	}
	
	public int weeklySalary()
	{
		return yearlySalary/WEEKS_IN_A_YEAR;
	}
	
	public int monthlySalary()
	{
		return yearlySalary/MONTHS_IN_A_YEAR;
	}
	
	public int quarterlySalary()
	{
		return yearlySalary/3;
	}
	
	
	public String getEmployeeInfo()
	{
		return "Employees Name: " + name + ", Department: " + department + ", Seniority: " + seniority + ", Salary: " + yearlySalary;
	}
	
}
