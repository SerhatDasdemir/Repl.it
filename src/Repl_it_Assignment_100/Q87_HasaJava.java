package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q87_HasaJava {

	public static void main(String[] args) {


	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    
	   
	    	
	    	if ((word.length()>4) && (word.substring(0, 4).equalsIgnoreCase("java") || word.substring(1, 5).equalsIgnoreCase("java"))) {
	    	    System.out.println(!exists);
	    	
	    }else {
	    	System.out.println(exists);
	    }
	    	
	}

}
