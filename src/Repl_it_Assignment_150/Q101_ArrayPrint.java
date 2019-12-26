package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q101_ArrayPrint {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	    
	    String s="";
	    
	    for(int i=0;i<5;i++) {
	    	s= words[i].substring(0, 1)+words[i].substring(words[i].length()-1);
	    	 System.out.println(s);
	    	
	    }
	    
	   
	}

}
