package dessertShop;

public class Cookie extends DessertItem {
	//Attributes
	int cookieQty;
	double pricePerDozen;
	
	//Constructors
	public Cookie() {
		cookieQty = 0;
		pricePerDozen = 0;
		}
		
	public Cookie (String n, int cq, double pd) {
		super(n);
		cookieQty = cq;
		pricePerDozen = pd;
		}

	public int getCookieQty() {
		return cookieQty;
	}

	public void setCookieQty(int cookieQty) {
		this.cookieQty = cookieQty;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}

	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}
	
	double calculateCost() {
		double qty = Double.valueOf(cookieQty) / 12;
		
		return qty * pricePerDozen;
	}
	public String toString() {
		String line1 = super.getName();
		String line2Pt1 = cookieQty + " Cookies @ $" + pricePerDozen + "/Dozen";
		String line2Pt2 = String.format("$%.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%.2f]", super.calculateTax(calculateCost()));
		
		return String.format("%s\n\t%-45s%s%17s%n", line1, line2Pt1, line2Pt2, line2Pt3);
}
	
}
