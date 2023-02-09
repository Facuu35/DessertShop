package dessertShop;

abstract class DessertItem {
	//Attributes
	private String name;
	double taxPercent = 7.25;
	
	//constructors
	public DessertItem() {
		name = "";
	}
	
	public DessertItem (String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTaxPercent(){
		return this.taxPercent;
	}
	
	public void setTaxPercent(double taxPercent){
		this.taxPercent = taxPercent;
	}
	abstract double calculateCost();
		

	public double calculateTax(double p) {
		double tax = taxPercent/100;
		double orderTax = tax * p;
		return orderTax;
	}
		
	
}
