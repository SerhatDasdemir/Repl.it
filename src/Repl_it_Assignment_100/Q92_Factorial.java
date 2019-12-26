package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q92_Factorial {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    long faktoriyel = 1;
        for(int i = 2; i<= n; i++){
            faktoriyel = faktoriyel * i;
        }
         
        System.out.println(faktoriyel);
	}

}
