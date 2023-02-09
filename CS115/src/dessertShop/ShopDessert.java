package dessertShop;

import java.util.Scanner;

public class ShopDessert {

	private static DessertItem userPromptCandy(){
		  Scanner scan = new Scanner(System.in);
		  Candy Candy = new Candy("", 0.0, 0.0);
		    System.out.print("Enter the type of Candy: ");

		    while (!scan.hasNext("^[a-zA-Z]+$")) {
	            System.out.println("Invalid input. Enter a type of candy:");
	            scan.next();
	        }
		    String name = scan.next("^[a-zA-Z]+$");
		    System.out.print("Enter the quantity purchased: ");
		    double quantity = 0;
		    while (!scan.hasNextDouble()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    quantity = scan.nextDouble();
		    System.out.print("Enter the price per dozen: ");
		    int price = 0;
		    while (!scan.hasNextInt()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    price = scan.nextInt();
		    Candy = new Candy(name, price, quantity);
		    return Candy;
	}
	private static DessertItem userPromptCookie(){
		 Scanner scan = new Scanner(System.in);
		 Cookie cookie = new Cookie("", 0, 0.0);
		    System.out.print("Enter the type of cookie: ");
		    String name = scan.nextLine();
		    System.out.print("Enter the quantity purchased: ");
		    int quantity = 0;
		    while (!scan.hasNextInt()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    quantity = scan.nextInt();
		    System.out.print("Enter the price per dozen: ");
		    double price = 0;
		    while (!scan.hasNextDouble()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    price = scan.nextInt();
		    cookie = new Cookie(name, quantity, price);
		    return cookie;
	}
	private static DessertItem userPromptIceCream(){
		 Scanner scan = new Scanner(System.in);
		 IceCream icecream = new IceCream("", 0, 0.0);
		 
		    System.out.print("Enter the type of Ice Cream used: ");
		    String name = scan.nextLine();
		    
		    System.out.print("Enter the number of scoops: ");
		    int quantity = 0;
		    while (!scan.hasNextInt()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    quantity = scan.nextInt();
		    System.out.print("Enter the price per scoop: ");
		    double price = 0;
		    while (!scan.hasNextDouble()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    price = scan.nextInt();
		    icecream = new IceCream(name, quantity, price);
		    return icecream;
	}
	private static DessertItem userPromptSundae(){
		 Scanner scan = new Scanner(System.in);
		 Sundae sundae = new Sundae("", 0, 0.0, "", 0.0);
		 
		 
		    System.out.print("Enter the type of IceCream: ");
		  
		    while (!scan.hasNext("^[a-zA-Z]+$")) {
	            System.out.println("Invalid input. Enter a type of IceCream:");
	            scan.next();
	        }
		    String name = scan.next("^[a-zA-Z]+$");
	        
		    System.out.print("Enter the number of scoops: ");
		    int quantity = 0;
		    while (!scan.hasNextInt()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    quantity = scan.nextInt();
		    System.out.print("Enter the price per scoop: ");
		    float price;
		    while (!scan.hasNextFloat()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    price = scan.nextFloat();
		
		    System.out.print("Enter the type of Topping: ");
			  
		    while (!scan.hasNext()) {
	            System.out.println("Invalid input. Enter a type of Topping:");
	            scan.next();
	        }
		    String name1 = scan.next();
		    
		    
		    System.out.print("Enter the price for the topping: ");
		    double topping = 0;
		    while (!scan.hasNextDouble()) {
		        System.out.print("Invalid input. Enter a number: ");
		        scan.next();
		    }
		    topping = scan.nextInt();
		    
		    sundae = new Sundae(name, quantity, price, name1, topping);
		    return sundae;
	
	}
	
	public static void main(String[] args) {
		
		
		
		order list = new order();
		
		Scanner sIn = new Scanner(System.in);    
		String choice;
		DessertItem orderItem;

		boolean done = false;
		while (!done) {
		    System.out.println("\n1: Candy");
		    System.out.println("2: Cookie");            
		    System.out.println("3: Ice Cream");
		    System.out.println("4: Sunday");

		    System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
		    choice = sIn.nextLine();
		    
		    if (choice.equals("")) {
		        done = true;
		    } else {
		        switch (choice) {
		            case "1":            
		                orderItem = userPromptCandy();
		                list.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "2":            
		                orderItem = userPromptCookie();
		                list.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "3":            
		                orderItem = userPromptIceCream();
		                list.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "4":            
		                orderItem = userPromptSundae();
		                list.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            default:            
		                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
		                break;
		        }//end of switch (choice)
		    }//end of if (choice.equals(""))
		}//end of while (!done)
		System.out.println("\n");
		
		
		
		
		Candy i1 = new Candy("Candy Corn", 1.5, .25);  
		list.add(i1);		
		
		Cookie i2 = new Cookie("Chocolate Chip", 6, 3.99);
		list.add(i2);
		
		Sundae i3 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
		list.add(i3);
		
		IceCream i4 = new IceCream("Pistachio", 2, .79);
		list.add(i4);
		
		Candy i5 = new Candy ("Gummy Bears", .25, .35);
		list.add(i5);
		
		Cookie i6 = new Cookie ("Oatmeal Raisin", 2, 3.45);
		list.add(i6);
	/*

		for(DessertItem o : list.getOrderList()) {
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", o.getName(), o.calculateCost(), o.calculateTax(o.calculateCost()));
			
 }
		
		System.out.println("------------------------------------------------------");
		
		
		System.out.printf("%nOrder Subtotals: $%6.2f [Tax: $%6.2f]", list.orderCost(), list.orderTax());
		System.out.printf("%nOrder Total: $%.4s %n",(list.orderTax()+list.orderCost()));
		System.out.printf("%nTotal number of items in order: %d %n", list.itemCount());
		*/
	System.out.println("------------------------------------Receipt------------------------------------");
		for (DessertItem o : list.getOrderList()) {
			System.out.print(o.toString());
		}
		
		System.out.println("------------------------------------------------------");
		System.out.printf("%nTotal number of items in order: %d %n", list.itemCount());
		System.out.printf("%-53s$%-9.2f[Tax: $%.2f] %n", "Order Subtotals: ", list.orderCost(), list.orderTax());
		double totalOrder = list.orderCost() + list.orderTax();
		System.out.printf("\n%-53s$%.2f", "Order Total:", totalOrder);
		
		
		
} //end main
	
	
}