package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q72_Email1 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    
		    int z=0;
		    int y =0;
		   
		   if (email.contains("_")) {
		   
		   for (int x=0;x<email.length();x++) {
			    if (email.charAt(x)=='@') {
		    		y=x;
		    	}
		   }
		    
		    for (int i = 0 ; i<email.length();i++) {
		    	if(email.charAt(i)== '_') {
		    		z=i;
		    			
		    	}	    	
		    }
		    
		    System.out.println(email.substring(z+1,y) + email.charAt(z) + email.substring(0, z) + email.substring(y));
		    
		   								}
		   else {
			   System.out.println(email);
		   }
	}

}
