
abstract class Employee {
	
		private String name;
		private String department;
		private String seniority;
		private int yearlySalary;

	public Employee(String name, String department, String seniority, int yearlySalary) {
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

}
