package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q135_Arrays_Shift_Left {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    int num0=nums[0];
		   		    //WRITE YOUR CODE HERE
		    
		    for(int i=0;i<nums.length-1;i++) {
		    	nums[i]=nums[i+1];
		    	
		    }
		    nums[nums.length-1]=num0;
		    System.out.println(Arrays.toString(nums));
		    
	}

}
