package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q90_countJava {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    
	    int counter=0;
	    String str ="java";
		
		for (int i=0; i<word.length()-3; i++) {
			
			if (word.substring(i,i+4).equalsIgnoreCase(str)) {
				
				counter++;
				
			
		}
		}
		
		System.out.println( counter);
	}
	}


