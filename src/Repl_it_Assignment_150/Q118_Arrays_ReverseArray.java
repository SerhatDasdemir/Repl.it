package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q118_Arrays_ReverseArray {

	
		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    
		    int x=nums.length-1;
		    
		    for(int i=0; i<nums.length/2;i++) {
		    
		    int a=nums[i];
		    nums[i] = nums[x];	
		   
		    x--;
		    nums[x+1]=a;
		    
		    }
		   
		    //Do not change below statement:
		    System.out.println(Arrays.toString(nums));
		    

	}

	
}
