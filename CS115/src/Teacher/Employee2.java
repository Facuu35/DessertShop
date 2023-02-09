package Teacher;


public class Employee2 extends w3_Person {
	//attributes
	private int empID;
	
	//Constructors
	
	public Employee2(String n, String g, int id) {
		super(n, g);
		empID = id;
	}
	//Methods
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int id) {
		empID = id;
	}
}
