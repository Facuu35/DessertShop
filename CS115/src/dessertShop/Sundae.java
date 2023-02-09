package dessertShop;

public class Sundae extends IceCream {
	//Attributes
	String toppingName;
	double toppingPrice;
	
	//Constructors
	public Sundae() {
		toppingName = "";
		toppingPrice = 0;
	}
	
	public Sundae (String n, int sc, double ps, String tn, double tp) {
		super(n, sc, ps);
		toppingName = tn;
		toppingPrice = tp;
	}
	
	public String getToppingName() {
		return toppingName;
	}
	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}
	public double getToppingPrice() {
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
	double calculateCost() {
		return super.calculateCost() + toppingPrice;
	
}
	public String toString() {
	String line1 = super.getName() + "Sundae";
	String line1Pt2 = toppingName + "topping @ $ " + toppingPrice;
	
	String line2Pt1 = super.getScoopCount() + " scoops of " + super.getName() + " ice cream @ $" 
			+ super.getPricePerScoop() + "/scoop";
	
	String line2Pt2 = String.format("$%.2f", calculateCost());
	String line2Pt3 = String.format("[Tax: $%.2f]", super.calculateTax(calculateCost()));
	
	return String.format("%s\n\t%-45s\n\t%-45s%5s%17s%n", line1, line2Pt1, line1Pt2, line2Pt2, line2Pt3);
}
}