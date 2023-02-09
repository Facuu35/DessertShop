package Teacher;
import java.time.LocalDate;

public class Person {
	//Attributes
	private String name;
	private String gender;
	private LocalDate dob;
	private String phone;
	
	
	//Constructors
	public Person(String n, String g, String d, String p) {
		name = n;
		gender = g;
		dob = LocalDate.parse(d);
		phone = p;
	};
	
	public Person() {
		name = "";
		gender = "";
		dob = LocalDate.parse("04-04-2000");
		phone = "";
	}
	
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String g) {
		this.gender = g;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob (String dob){
		this.dob = LocalDate.parse(dob);
	}
	public String getPhone () {
		return phone;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
}

