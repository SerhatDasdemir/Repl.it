package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q73_Email2 {

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    int x=0;
		    int y=0;
		    int z=0;
		    
		    for (int i=0;i<email.length();i++) {
		    	if(email.charAt(i)== '_') {
		    		x=i;
		    	}else if (email.charAt(i)== '@') {
		    		y=i;
		    	}else if (email.charAt(i)== '.') {
		    		z=i;
		    	}
		    	
		    }
		    String name = email.substring(0,1);
		    System.out.println("First name: "+ name.toUpperCase()+ email.substring(1, x));
		    
		    String Lname=email.substring(x+1, x+2);
		    System.out.println("Last name: "+ Lname.toUpperCase()+ email.substring(x+2, y));
		    
		   
		    System.out.println("Domain: " + email.substring(y+1, z));
		    
		    
		    System.out.println("Top-Level Domain: "+ email.substring(z+1));
		    
	}

}
