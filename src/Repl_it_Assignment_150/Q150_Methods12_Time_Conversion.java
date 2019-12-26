package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q150_Methods12_Time_Conversion {
	
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    timeConversion(scan.nextLine());
  }
  
  public static void timeConversion(String s) {
    /*
		 * Write your code here.
		 */
	  String[] arr= null;
	    arr = s.split(":");  
	    int x = Integer.valueOf(arr[0]);
	    
	  if(s.substring(s.length()-2).equalsIgnoreCase("PM")){
		 	  
		  if(x==12) {
			  arr[0] = "00";  
		  }else {
		  arr[0] =""+(x+12);
		  }
		  
	  }else {
		  arr = arr;
	  }
	  
	  System.out.println(arr[0]+":"+arr[1]+":"+arr[2].substring(0, 2));
		 
  }
}