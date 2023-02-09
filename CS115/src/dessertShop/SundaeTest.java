package dessertShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SundaeTest {

	@Test
	void testGetToppingPrice() {
		Sundae p = new Sundae("banana", 2);
		assertEquals(2, p.getToppingPrice());
		}

	@Test
	void testSetToppingPrice() {
		Sundae pSet = new Sundae();
		pSet.setToppingPrice(5);
		assertEquals(5, pSet.getToppingPrice());
	}
	
	
	@Test
	void testGetToppingName() {
		Sundae p = new Sundae("banana", 2);
		assertEquals("banana", p.getToppingName());
		}

	@Test
	void testSetToppingName() {
		Sundae pSet = new Sundae();
		pSet.setToppingName("james");
		assertEquals("james", pSet.getToppingName());
	}
	

}
