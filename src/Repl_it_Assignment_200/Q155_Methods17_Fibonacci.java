package Repl_it_Assignment_200;

import java.util.Scanner;

public class Q155_Methods17_Fibonacci {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
		  
		  int sum =0;
		  int x=1;
		 
		  
		  for(int i=0;i<num;i++) {
			  
			  x=x+sum;
			  sum=x-sum;
			 
		  }
		  
		  System.out.println(sum);
	  }
	}


