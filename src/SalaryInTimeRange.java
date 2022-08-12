
public interface SalaryInTimeRange {

	final int DAYS_IN_A_YEAR = 365;
	final int WEEKS_IN_A_YEAR = 52;
	final int MONTHS_IN_A_YEAR = 12;
	
	public int dailySalary();
	
	public int weeklySalary();
	
	public int monthlySalary();
	
	public int quarterlySalary();
	
}
