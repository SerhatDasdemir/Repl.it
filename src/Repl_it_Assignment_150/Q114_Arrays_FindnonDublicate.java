package Repl_it_Assignment_150;

import java.util.*;

public class Q114_Arrays_FindnonDublicate {

	public static void main(String[] args) {
		 	Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		
		 Arrays.sort(nums);
		   for(int i=0; i<nums.length-1; i++){
		     if(nums[i]!=nums[i+1]){
		       System.out.println(nums[i]);
		       break;
		     }
		     i++;
		     if(i==nums.length-2){
		       System.out.println(nums[i+1]);
		     }
		   }   
	}
		    	
}
	


