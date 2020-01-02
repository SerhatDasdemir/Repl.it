package Repl_it_Assignment_200;

import java.util.*;

public class Q154_Methods16_Check_palindromeNum {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	    
		  int first = num;        
	      int length = String.valueOf(num).length();
	         
	        int x,y=0;
	        for (int i = 0; i<length; i++){
	             
	            x = num % 10;
	            y = y * 10 + x;
	            num = num /10;
	        }
	         
	        if(y == first){
	            System.out.println(true);
	        }else{
	            System.out.println(false);
	        }
	         
	    }
	
	    
	    	
	    	
	    	
	    }
	    
	  
	


