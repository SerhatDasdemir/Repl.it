package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q124_Arrays_Front_Piece {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//WRITE YOUR CODE HERE
		
		int x=2;
		if(size<2) {
			x=1;
		}
		
		int [] Arr2 = new int [x];
		
		for(int i=0; i<Arr2.length;i++) {
			Arr2[i]=num[i];
		}
		
		System.out.println(Arrays.toString(Arr2)); 
	}

}
