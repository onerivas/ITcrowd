
public class CEO extends Employee {

	public CEO(String name, String department, String seniority, int yearlySalary)
	{
		super(name, department, seniority, yearlySalary);
	}
	
	public CEO () {}
	
	public void fireEmployee(Employee employeeBeingFired)
	{
		employeeBeingFired = null;
	}
	
	public void fireDepartment(Department department)
	{
		department.removeAll();
	}
}
