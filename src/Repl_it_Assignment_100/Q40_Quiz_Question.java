package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q40_Quiz_Question {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String a = s.nextLine();
	    
	    //your code here
	    String str1="a";
	    String str2 = "b";
	    String str3 = "c";
	    
	    if(a.equals(str1)) {
	    	
	    	System.out.println(a + " is wrong");
	    }else if (a.equals(str2)) {
	    	System.out.println(a+ " is correct");
	    }else if (a.equals(str3)) {
	    	System.out.println(a + " is wrong");
	    }else {
	    	System.out.println(a+ " is not a valid answer");
	    }
	    
	}

}
