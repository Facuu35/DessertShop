package dessertShop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DessertItemTest {
	@Test
	void testGetName() {
		DessertItem p = new DessertItem ("john");
		assertEquals("john", p.getName());
		}

	@Test
	void testSetName() {
		DessertItem pSet = new DessertItem();
		pSet.setName("john");
		assertEquals("john", pSet.getName());
		}
}
