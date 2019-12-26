package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q89_Repeat_Seperator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    
		    for (int i = 1; i<count+1;i++) {
		    	
		    	
			  
				   System.out.print(word);
		   
			  if(i<count) {
				   System.out.print(separator);
			   }


		    	
		    }
		    
	}

}
