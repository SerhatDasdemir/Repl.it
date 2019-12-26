package Repl_it_Assignment_100;

import java.util.ArrayList;
import java.util.Scanner;

public class Q83_Party {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	    
	    // your code 
	    // ------------------------------------------
		
		
		String name;
		String newName;
		
		String list="";
		String s="";
		
		
		do {System.out.println("Please enter guest name:");
			 name = input.next();
		
			System.out.println("Do you want to enter new guest name:");
			 newName= input.next();
			 
			list=list+s+name;
			s=", ";
			
			 
		}while (newName.equalsIgnoreCase("yes")); 
		
		
			
			System.out.println("Guest's list: "+list);	


	}

}
