package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q104_Array_has5 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	   String x="false";
	    
	    for(int i=0;i<4;i++) {
	    	if(nums[i]==5 && nums[i]==nums[i+1]) {
	    		x="true";
	    	}
	    	
	    }
	    System.out.println(x);
	    
	}

}
