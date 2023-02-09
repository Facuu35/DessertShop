package dessertShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie p = new Cookie (2, 5);
		assertEquals(2, p.getCookieQty());
		}

	@Test
	void testSetCookieQty() {
		Cookie pSet = new Cookie();
		pSet.setCookieQty(5);
		assertEquals(5, pSet.getCookieQty());
	}
	@Test
	void testGetPricePerDozen() {
		Cookie p = new Cookie (2, 5);
		assertEquals(5, p.getPricePerDozen());
		}

	@Test
	void testSetPricePerDozen() {
		Cookie pSet = new Cookie();
		pSet.setPricePerDozen(5);
		assertEquals(5, pSet.getPricePerDozen());
	}
	
	
}
