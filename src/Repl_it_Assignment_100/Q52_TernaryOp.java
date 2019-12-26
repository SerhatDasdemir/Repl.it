package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q52_TernaryOp {

	public static void main(String[] args) {

		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			//WRITE YOUT CODE HERE

			int max = x >= 5? x : -x;

			System.out.println(max);
	}

}
