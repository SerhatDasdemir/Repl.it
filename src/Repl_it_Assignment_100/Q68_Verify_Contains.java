package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q68_Verify_Contains {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    
	    if (sentence.contains(word)) {
	    	
	    	System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }
	}

}
