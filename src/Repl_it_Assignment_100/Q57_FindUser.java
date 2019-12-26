package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q57_FindUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    System.out.println("Enter full name:");
	    String input = scan.nextLine();
	    
	    if (input.equalsIgnoreCase("max payne") || input.equalsIgnoreCase("Alan Wake")) {
	    	System.out.println("User found!");
	    }else {
	    	System.out.println("User not found!");
	    	
	    }
	    
	    
	    	
	    

	}

}
