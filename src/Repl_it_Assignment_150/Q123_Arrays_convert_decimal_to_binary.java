package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q123_Arrays_convert_decimal_to_binary {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    
		    int[] binary = new int[8];
		    
		    
		    
		    
		    	
		    	for (int i=binary.length-1;i>=0;i--) {
		    			    	
		    		binary[i] = decimal%2;
		    		
		    		decimal=decimal/2;
		    		
		    }
		    	
		   
		    System.out.println(Arrays.toString(binary));
		   
	}

}
