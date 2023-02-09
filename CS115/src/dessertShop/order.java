package dessertShop;

import java.util.ArrayList;

public class order {

	//Attributes
	ArrayList<DessertItem> order;
	
	//constructor
	public order(){
		order = new ArrayList<DessertItem>();
	}
	//method
	public ArrayList<DessertItem> getOrderList() { 
	return order;
	}
	
	
	
	
	public void add(DessertItem i) {
		order.add(i);
	}
	
	public int itemCount() {
		return order.size();
		}
	
	public double orderCost() {
		double sum = 0;
		for(DessertItem i : order) {
			sum += i.calculateCost();
		}
	return sum;	
	}
	public double orderTax() {
		double taxsum = 0;
		for(DessertItem i : order) {
			taxsum += i.calculateTax(i.calculateCost());
		}
	return taxsum;
		
	}	
	
}
