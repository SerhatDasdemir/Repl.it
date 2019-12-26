package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q32_Vending_Machine {

	public static void main(String[] args) {

		 Scanner sc  = new Scanner (System.in);
		    
		    System.out.print ("Enter price in cents:");
		    int itemPrice = sc.nextInt ();
		    
		     if (itemPrice<25 || itemPrice>100 || itemPrice%5 != 0) {
			    		System.out.println("Invalid price!");
			    												}
		    
		      int quarters = (100-itemPrice)/25;
			    int dimes = (100-itemPrice)/10;
			    int nickels = (100-itemPrice)/5;
			
		System.out.print("Your change is " +quarters + " quarters, " + dimes +" dimes, and " +nickels + " nickels " );
		   
	  
	   

	}

}
