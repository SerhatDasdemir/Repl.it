package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q120_Array_ShortsWord {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    
	    
	    int i=Integer.MAX_VALUE;
	    String result="";
	    for(String each : str) {
	    	
	    	if(each.length()<i) {
	    		
	    		result=each;
	    		i=result.length();
	    		
	    		
	    	}
	    	
	    	
	    }
	    
	    System.out.println(result);
	}

}
