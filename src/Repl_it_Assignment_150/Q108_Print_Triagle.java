package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q108_Print_Triagle {
/*
 
 Example:
input: 3
output: *
output: **
output: ***
 
 */
	
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (; i<=n ; i++){
			
			for (j=1; j<=i ; j++)
				
							
				System.out.print(" " + "*");
				
				System.out.println(" ");							
				
		}


		}
		
	
	}
	