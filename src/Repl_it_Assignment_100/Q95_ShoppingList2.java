package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q95_ShoppingList2 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		 
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalProce = 0;
		
		String s = "";
		
		do {
			
			
			System.out.println("Enter Item"+count+" and its price:");
				item = scan.next();
				price = scan.nextDouble();
				
			
			
				System.out.println("Add one more item?");
				countinue = scan.next();
				
				
			totalProce = totalProce+price;	
			shoppingListReport = shoppingListReport+s+"Item" +count+": "+item+" Price: "+ price;
			s=", ";
			count++;
			
		}while (countinue.equalsIgnoreCase("yes") || count==10);
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: "+totalProce);

	}

}
