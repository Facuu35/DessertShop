package Teacher;



public class Hourly extends Employee2 {
	//Attributes
	private double hourlyWage;
	private double hoursWorked;
	
	
	//Constructors
	
	public Hourly() {
		super();
		hourlyWage = 0.0;
		hoursWorked = 0.0;
	}
	
	public Hourly(String n, String g, int id, double hw, double hrsw) {
		super(n, g, id);
		hourlyWage = hw;
		hoursWorked = hrsw;
		
	}
	
	//Methods
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	public void setHourlyWage(double hw) {
		hourlyWage = hw;
	}
	public double getHourlyWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hw) {
		HoursWorked = hrsw;
	}

}
