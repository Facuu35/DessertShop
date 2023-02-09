package Teacher;
import java.time.LocalDate;

public class Persons {
	//attributes
	private String name;
	private LocalDate dob;
	private String gender;
	private String phone;
	
	
	
	//constructors
	public Persons() {
		name = "";
		dob = LocalDate.of(1900, 1, 1);
		gender = "";
		phone = "";
		
	}
	
	public Persons(String n, String d, String g, String ph) {
		name = n;
		dob = LocalDate.parse(d);
		gender = g;
		phone = ph;
		
	}


	// Methods

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	
}
	