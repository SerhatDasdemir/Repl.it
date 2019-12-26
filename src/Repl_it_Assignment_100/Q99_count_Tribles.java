package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q99_count_Tribles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int count = 0 ;
	    //WRITE YOUR CODE HERE
	    
	    for(int i=0;i<=str.length()-3;i++) {
	    	
	    	if(str.substring(i, i+1).equals(str.substring(i+1,i+2))&&
	    	   str.substring(i+1, i+2).equals(str.substring(i+2,i+3)))
	    	{
	    		
	    		count++;
	    		
	    		
	    	}
	    	
	    }
	    
	    System.out.println(count);
	}

}
