package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q34_VideoGameCoupons {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of coupons:");
		int coupons = sc.nextInt();
		int candies = coupons/10;
		int gumballs = (candies%10)/3;
		
		if (coupons<10 && coupons>=3) {
			
			System.out.println("Number of Gumballs: " + coupons/3);
			
		}else if (coupons>=10) {
			System.out.println("Number of Candies: " + candies);
			System.out.println("Number of Gumballs: " + gumballs);
		}else {
			
			System.out.println("Not enough coupons");
		}

	}

}
