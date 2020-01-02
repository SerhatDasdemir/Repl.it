package Repl_it_Assignment_200;

import java.util.*;

public class Q152_Methods14_Print_unique_numbers {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  }
	  
	  public static void printUniqueNumbers(int[] nums){
	    //WRITE YOUR CODE HERE
		  
		    
		    for(int i = 0; i < nums.length; i++){
		        int dups = 0;
		        for(int j = 0; j < nums.length; j++){
		            if(nums[i] == nums[j]){
		                dups++;
		            }
		        }
		        if(dups == 1){
		            System.out.println(nums[i]);
		        }
		    }
		    
		}
	  }
	