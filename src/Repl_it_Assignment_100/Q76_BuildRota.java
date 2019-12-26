package Repl_it_Assignment_100;


import java.util.Scanner;

public class Q76_BuildRota {
/*left, right, up , down */
	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    
	    String start = scan.next();
	    String end = scan.next();
	 
	   for (int i=0; i<2;i++) {
	    switch (start) {
	    
	    case "A":   	
	    	
	    	if (end.equalsIgnoreCase("A")) {
	    		i=1;
	    		System.out.print("A found");
	    		break;
	    	}
	    	System.out.print("right");
	    	if(!end.equalsIgnoreCase("B")) {
	    		System.out.print(" > ");
	    	}else {
	    		System.out.print(": ");
	    	}
	    	
	    case "B":
	    	
	    	if (end.equalsIgnoreCase("B")) {
	    		System.out.print("B found");
	    		i=1;
	    		break;}
	    	System.out.print("down");
	    	if(!end.equalsIgnoreCase("C")) {
	    		System.out.print(" > ");
	    	}else {
	    		System.out.print(": ");
	    	}
	    	
	    case "C":
	    	
	    	if (end.equalsIgnoreCase("C")) {
	    		System.out.print("C found");
	    		i=1;
	    		break;}
	    	System.out.print("left");
	    	if(!end.equalsIgnoreCase("D")) {
	    		System.out.print(" > ");
	    	}else {
	    		System.out.print(": ");
	    	}
	    	
	    case "D":
	    	
	    	if (end.equalsIgnoreCase("D")) {
	    		System.out.print("D found");
	    		i=1;
	    		break;}
	    	System.out.print("up");
	    	
	    	if(!end.equalsIgnoreCase("A")) {
	    		System.out.print(" > ");
	    		start ="A";
	    	}else {
	    		System.out.print(": ");
	    		start ="A";
	    	}
	    
	    
	    }
	   
	   }

	}
	 
	}


