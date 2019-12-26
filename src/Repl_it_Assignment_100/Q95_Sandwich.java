package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q95_Sandwich {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     
	     	int i=0;
	     	int x=0;
		    int y=0;
		    String z ="";
		   
		    for (int a = 0; a<=str.length()-5; a++) {
		    	
		    	if (str.substring(a, a+5).equals("bread") || str.substring(str.length()-5).equals("bread")) {
		    		i++;
		    		
		    			
		    	}
		    	
		    	
		    }
		    
		    if (i>=2) {
	    		x = str.indexOf("bread");
	    		y = str.substring(x+1).lastIndexOf("bread");
	    		z = str.substring(x+5, y+x+1);
	    	}else {
	    		
	    		z = "nothing";
	    		
	    }

		    
		    System.out.println(z);
	}

}
