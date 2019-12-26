package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q93_PrefixAgain {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    
	    int num = 0;
	    
	    for (int i = 0; i<str.length()-n;i++) {
	    	
	    	if (str.substring(0, n).equals(str.substring(i, i+n))) {
	    		
	    		num++;
	    	}
	    }
	    if (num>1) {
	    	 System.out.println(true);
	    	
	    }else {
	    	System.out.println(false);
	    }
	   
	}

}
