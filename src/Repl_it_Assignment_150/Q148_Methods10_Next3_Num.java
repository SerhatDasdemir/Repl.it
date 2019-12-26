package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q148_Methods10_Next3_Num {
	
	public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     
	     next3(num);
	  
	  }
	  
	public static void next3(int x) {
		
		for(int i=1;i<=3;i++) {
			
			System.out.print(x+i+" ");
			
		}
		
		
	}

}
