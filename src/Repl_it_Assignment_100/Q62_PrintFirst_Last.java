package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q62_PrintFirst_Last {

	public static void main(String[] args) {
		///DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(word.substring(0,1) + word.substring(word.length()-1));
	}

}
