package Repl_it_Assignment_100;

import java.util.*;

public class Q43_MidNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	    
	    System.out.println ("Enter first number:");
	    int num1 = sc.nextInt(); 
	    System.out.println ("Enter second number:");
	    int num2= sc.nextInt();  
	    System.out.println ("Enter third number:");
	    int num3= sc.nextInt(); 
	    
	    
	    if (num1>num2 && num1<num3 ) {
	    	System.out.println( "Medium value is:"+  num1);
	    }else if (num1>num3 && num1<num2) {
	    	System.out.println( "Medium value is:"+  num1);
	    
	    }else if (num2>num1 && num2<num3) {
	    	System.out.println( "Medium value is:"+  num2);
	    }else if (num2>num3 && num2<num1) {
	    	System.out.println( "Medium value is:"+  num2);
	    
	    }else if (num3>num2 && num3<num1) {
	    	System.out.println( "Medium value is:"+  num3);
	    }else if (num3>num1 && num3<num2) {
	    	System.out.println( "Medium value is:"+  num3);
	    }
	}

}
