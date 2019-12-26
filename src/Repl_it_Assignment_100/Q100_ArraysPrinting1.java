package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q100_ArraysPrinting1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below. 
		//Create another loop for your solution!
		
		for (int x = 0; x<arr.length; x++) {
			
			System.out.println(arr[x].substring(0,3));
			
		}

	}

}
