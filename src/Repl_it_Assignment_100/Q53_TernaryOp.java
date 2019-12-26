package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q53_TernaryOp {

	public static void main(String[] args) {

		 //DO NOT CHANGE
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			//WRITE YOUR CODE HERE

			int condition = num1 >= num2 ? num1 : num2;
			System.out.println(condition);

	}

}
