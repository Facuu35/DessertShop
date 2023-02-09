package testing;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonTest {

	

	@Test
	void testGetName() {
		Persons p = new Persons("Lebron", "2004-04-04", "male", "385-242-0139");
		assertEquals("Lebron", p.getName());
		}

	@Test
	void testSetName() {
		Persons pSet = new Persons();
		pSet.setName("Kobe");
		assertEquals("Kobe", pSet.getName());
	}

	@Test
	void testGetDob() {
		Persons p = new Persons("Lebron", "2004-04-04", "male", "385-242-0139");
		LocalDate dob = LocalDate.of(2004,04,04);
		assert(dob.equals(p.getDob()));
	}

	@Test
	void testSetDob() {
		Persons pSet = new Persons();
		pSet.setDob("2004-04-04");
		LocalDate dob = LocalDate.of(2004,04,04);
		assert(dob.equals(pSet.getDob()));
		
	}

	@Test
	void testGetGender() {
		Persons p = new Persons("Lebron", "2004-04-04", "male", "385-242-0139");
		assertEquals("male", p.getGender());
	}

	@Test
	void testSetGender() {
		Persons pSet = new Persons();
		pSet.setGender("male");
		assertEquals("male", pSet.getGender());
	}

	@Test
	void testGetPhone() {
		Persons p = new Persons("Lebron", "2004-04-04", "male", "385-242-0139");
		assertEquals("385-242-0139", p.getPhone());
	}

	@Test
	void testSetPhone() {
		Persons pSet = new Persons();
		pSet.setPhone("3852420139");
		assertEquals("3852420139", pSet.getPhone());
	}

}
