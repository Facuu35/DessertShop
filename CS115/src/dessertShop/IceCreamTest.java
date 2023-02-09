package dessertShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class IceCreamTest {
	
	@Test
	void testGetScoopCount() {
		IceCream p = new IceCream ("", 2, 5);
		assertEquals(2, p.getScoopCount());
		}

	@Test
	void testSetScoopCount() {
		IceCream pSet = new IceCream();
		pSet.setScoopCount(5);
		assertEquals(5, pSet.getScoopCount());
	}
	@Test
	void testGetPricePerScoop() {
		IceCream p = new IceCream ("", 2, 5);
		assertEquals(5, p.getPricePerScoop());
		}

	@Test
	void testSetPricePerScoop() {
		IceCream pSet = new IceCream();
		pSet.setPricePerScoop(5);
		assertEquals(5, pSet.getPricePerScoop());
	}

}
