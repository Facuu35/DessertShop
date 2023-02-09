package dessertShop;

public class IceCream extends DessertItem {
	//Attributes
	int scoopCount;
	double pricePerScoop;

	//Constructors
	public IceCream() {
		scoopCount = 0;
		pricePerScoop = 0;
		}
		
	public IceCream (String n, int sc, double ps) {
		super(n);
		scoopCount = sc;
		pricePerScoop = ps;
		}

	public int getScoopCount() {
		return scoopCount;
	}

	public void setScoopCount(int scoopCount) {
		this.scoopCount = scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setPricePerScoop(double pricePerScoop) {
		this.pricePerScoop = pricePerScoop;
	}
	
	double calculateCost() {
		return scoopCount * pricePerScoop;
		
	}
	public String toString() {
		String line1 = super.getName();
		String line2Pt1 = scoopCount + " scoop @ $" + pricePerScoop + "/scoop";
		String line2Pt2 = String.format("$%.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%.2f]", super.calculateTax(calculateCost()));
		
		return String.format("%s\n\t%-45s%s%17s%n", line1, line2Pt1, line2Pt2, line2Pt3);
}
}

