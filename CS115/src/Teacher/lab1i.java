package Teacher;
import java.util.Scanner; // Needed for user input
import java.util.ArrayList; // Needed to create dynamic Array (ArrayList)
import java.util.Collections; // Needed to sort an array

public class lab1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String data;
		boolean loop = false;

		loop = false;
		while(!loop) {
			System.out.println("Please enter a number (or hit the <Enter> key to stop): ");
			data = input.nextLine();
			
			if(data.equals("")) {
				loop = true;
				
			}else {
				try {
					int tempNum = Integer.parseInt(data);
					numbers.add(tempNum);
					System.out.println(numbers);
				} catch (NumberFormatException e) {
							System.out.println("Invalid response. " + data + " is not a valid response.");
				}//end catch
			}


		}//end loop
		System.out.println("The total of the list of numbers is: " + addNumbers(numbers));
		System.out.println("The biggest number in the list is: " + largestNumber(numbers));


		
	}//main

	private static int largestNumber(ArrayList<Integer> numbers) {
		int largest = numbers.get(0);
		
		for(int i = 0; i < numbers.size(); i++) {
			if(largest < numbers.get(i)) {
				largest = numbers.get(i);
			}
		}
		
		
		return largest;
		
	}

	private static int addNumbers(ArrayList<Integer> numbers) {
		int addnums = 0;
		for(int i = 0; i < numbers.size(); i++) {
			addnums += numbers.get(i);
		}
		
		return addnums;	
	}
	
	
	
	
	
	
	
}
