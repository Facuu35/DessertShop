package dessertShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CandyTest {


	@Test
	void testGetCandyWeight() {
		Candy p = new Candy ("", 2, 5);
		assertEquals(2, p.getCandyWeight());
		}

	@Test
	void testSetCandyWeight() {
		Candy pSet = new Candy();
		pSet.setCandyWeight(5);
		assertEquals(5, pSet.getCandyWeight());
		}
	@Test
	void testGetPricePerPound() {
		Candy p = new Candy ("", 2, 5);
		assertEquals(5, p.getPricePerPound());
		}
	@Test
	void testSetPricePerPound() {
		Candy pSet = new Candy();
		pSet.setPricePerPound(5);
		assertEquals(5, pSet.getPricePerPound());
		}
}
