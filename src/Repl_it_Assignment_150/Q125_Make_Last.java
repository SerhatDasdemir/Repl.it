package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q125_Make_Last {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
			
			int [] Arr2 = new int [size*2];
			
			for(int i=0; i<Arr2.length;i++) {
				Arr2[i]=0;
			}
			
			
			Arr2[Arr2.length-1] = nums[nums.length-1];
			
			System.out.println(Arrays.toString(Arr2));

	}

}
