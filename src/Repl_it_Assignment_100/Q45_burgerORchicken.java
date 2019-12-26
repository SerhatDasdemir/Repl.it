package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q45_burgerORchicken {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
	    
	    
	    String in = s.next();
	    
	    //your code here
	    
	    float x = 10;
	    float y = 2;
	    
	    if(in.contentEquals("chicken") || in.equals("burger")) {
	    	
	    	System.out.println(x);
	    }else {
	    	System.out.println(y);
	    	
	    }
	    
	}

}
