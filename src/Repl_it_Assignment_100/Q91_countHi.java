package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q91_countHi {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    int num =0;
	    
	    for (int i = 0; i<str.length()-1; i++) {
	    	
	    	if (str.substring(i, i+2).equals("hi")) {
	    		num++;
	    	}
	    }
	    
	    System.out.println(num);
	}

}
