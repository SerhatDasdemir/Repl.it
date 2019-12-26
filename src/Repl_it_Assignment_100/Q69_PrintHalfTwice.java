package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q69_PrintHalfTwice {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    String wordNew = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
	    System.out.println(wordNew);
	    
	    
	}

}
