package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q67_ReverseIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    String dummy = "";
	    
	    if(word.length()<5) {
	    	System.out.println("Too short!");
	    }else if (word.length()>5) {
	    	System.out.println("Too long!");
	    }else if (word.length()==5) {
	    	for(int i=word.length()-1;i>=0;i--) {
				
				dummy = dummy + word.charAt(i);    
			}
	    	
	    	System.out.println(dummy);
	    	
	    }
	    
	    
	    
	}

}
