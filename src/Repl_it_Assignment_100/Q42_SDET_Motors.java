package Repl_it_Assignment_100;

import java.util.*;

public class Q42_SDET_Motors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
	    System.out.println("Enter vehicle's year:");
	    int input = scan.nextInt();
	    
	    if (input>=1995 && input<=1998 || input>=2001 && input<=2002 || input>=2004 && input<=2006 || input>=2015 && input<=2017) {
	    	System.out.println("Your vehicle needs to be recalled!");
	    }else {
	    	System.out.println("Your vehicle is fine, enjoy!");
	    }

	}

}
