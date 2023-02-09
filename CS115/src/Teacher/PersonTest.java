package Teacher;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonTest {

	

	@Test
	void testGetName() {
		Persons p = new Persons("Lebron", "04-04-2004", "male", "385-242-0139");
		assertEquals("Lebron", p.getName());
		}

	@Test
	void testSetName() {
		Person pSet = new Person();
		pSet.setName("Kobe");
		assertEquals("Kobe", pSet.getName());
	}

	@Test
	void testGetDob() {
		Persons p = new Persons("Lebron", "04-04-2004", "male", "385-242-0139");
		LocalDate dob = LocalDate.of(2004,04,04);
		assert(dob.equals(p.getDob()));
	}

	@Test
	void testSetDob() {
		Person pSet = new Person();
		pSet.setDob("04-04-2004");
		LocalDate dob = LocalDate.of(04,04,2004);
		assert(dob.equals(pSet.getDob()));
		
	}

	@Test
	void testGetGender() {
		Persons p = new Persons("Lebron", "04-04-2004", "male", "385-242-0139");
		assertEquals("male", p.getGender());
	}

	@Test
	void testSetGender() {
		Person pSet = new Person();
		pSet.setGender("male");
		assertEquals("male", pSet.getGender());
	}

	@Test
	void testGetPhone() {
		Persons p = new Persons("Lebron", "04-04-2004", "male", "385-242-0139");
		assertEquals("385-242-0139", p.getPhone());
	}

	@Test
	void testSetPhone() {
		Person pSet = new Person();
		pSet.setPhone("3852420139");
		assertEquals("3852420139", pSet.getPhone());
	}

}
