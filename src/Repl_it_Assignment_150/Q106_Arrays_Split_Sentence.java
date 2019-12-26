package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q106_Arrays_Split_Sentence {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //"Java is fun"
	    //type your code below
	    
	    int a=0;
	    int b=0;
	    String str="";
	    
	    
	    for(int i=0;i<sentence.length();i++) {
	    	
	    	if(sentence.substring(i, i+1).equals(" ")) {
	    		
	    	
	    		str=sentence.substring(b, i);
	    		b=i+1;
	    		System.out.println(str);
	    	}
	    	
	    	
	    }
		
		System.out.println(sentence.substring(b));
	}

}
