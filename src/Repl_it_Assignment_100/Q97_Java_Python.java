package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q97_Java_Python {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int java=0;
	    int python=0;
	    
	    for(int i=0; i<=sentence.length()-4;i++) {
	    	if(sentence.substring(i,i+4).equalsIgnoreCase("java")) {
	    		java++;
	    		
	    	}
	    	
	    }
	    
	    for(int j=0;j<=sentence.length()-6;j++) {	
	    	if(sentence.substring(j,j+6).equalsIgnoreCase("python")) {
	    		python++;
	    	}
	    	
	    	
	    }
	  	    
	    if(java==python) {
	    	System.out.println(true);
	    	
	    }else {
	    	System.out.println(false);
	    }

	}

}
