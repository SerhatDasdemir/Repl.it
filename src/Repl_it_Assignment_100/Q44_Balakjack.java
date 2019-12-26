package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q44_Balakjack {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		    
		    
		    int house = s.nextInt();
		    int player = s.nextInt();
		    
		    //your code here

		   if (player>=21) {
			   System.out.println("bust");
		   }else if (house > player) {
			   System.out.println("player loss");
		   }else if (player == house) {
			   System.out.println("its a tie");
		   }else if (player>house) {
			   System.out.println("player wins");
		   }
		    		

		    
	}

}
