package dessertShop;

public class Candy extends DessertItem {
	//Attributes
	double candyWeight;
	double pricePerPound;
	
	//Constructors
	public Candy() {
		candyWeight = 0;
		pricePerPound = 0;
			}
			
	public Candy (String n , double cw, double pp) {
		super(n);
		candyWeight = cw;
		pricePerPound = pp;
			}

	public double getCandyWeight() {
		return candyWeight;
	}

	public void setCandyWeight(double candyWeight) {
		this.candyWeight = candyWeight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	
	double calculateCost(){
		
		return candyWeight * pricePerPound;
	
	}
	public String toString() {
		String line1 = super.getName();
		String line2Pt1 = candyWeight + " lbs @ $" + pricePerPound + "/lb";
		String line2Pt2 = String.format("$%.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%.2f]", super.calculateTax(calculateCost()));
		
		return String.format("%s\n\t%-45s%s%17s%n", line1, line2Pt1, line2Pt2, line2Pt3);
	}
	}
