package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q74_SMSmessage {
/*Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}*/
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    int x=0;int x1=0;
	    int y=0; int y1=0;
	    int z=0;  int z1=0;
	    
	    for (int i=0;i<message.length();i++) {
	    	if(message.charAt(i)== '<') {
	    		x=i;
	    	}else if (message.charAt(i)== '>') {
	    		x1=i;
	    	}else if (message.charAt(i)== '[') {
	    		y=i;
	    	}else if (message.charAt(i)== ']') {
	    		y1=i;
	    	}else if (message.charAt(i)== '{') {
	    		z=i;
	    	}else if (message.charAt(i)== '}') {
	    		z1=i;
	    	}
	    	
	    }
	    sender = message.substring(x+1, x1);
	    phoneNumber = message.substring(y+1, y1);
	    messageBody = message.substring(z+1, z1);
	    
	    System.out.println("Sender: "+ sender);
	    System.out.println("Phone Number: "+phoneNumber);
	    System.out.println("Message body: " + messageBody);
	    
	}
	
	

}
