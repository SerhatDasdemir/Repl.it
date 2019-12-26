package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q94_parseHTML {
	
	//<!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    
	    int x=0;
	    int y=0;
	    String str ="";
	   
	    
	    if (html.contains("<html>")) {
	    	x = html.indexOf("id=\"");
	    	y = html.substring(x).indexOf("\">");
	    
	    for (int i = 0; i<html.length()-6; i++) {

	    		str = html.substring(x+4, y+x);
	    	}
	    	}else {
	    		
	    		str = "Invalid input!";
	    }
	    
	    System.out.println(str);
	}

}
