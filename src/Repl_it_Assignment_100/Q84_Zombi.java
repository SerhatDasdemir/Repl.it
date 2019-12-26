package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q84_Zombi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    
	    int x = 0;
	    
    	if (inhabitants!=0) {
    		System.out.println("Day "+ x + " ["+ inhabitants+"]");
    	}

		   do {
			   
			   if (inhabitants!=0) {
		    	x++;
		    	inhabitants =inhabitants/2;
		    	System.out.println("Day "+ x + " ["+ inhabitants+"]");}
		    	
		    	
		   }while (inhabitants/2 != 0);
		   
		    	
		    	System.out.println("---- EXTINCT ----");
	    }
	}


