package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q146_Methods8_split_person_info {
	
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		   public static void person(String info) {
			
				//your code here
			   
			   String[] strArr= null;
			    strArr = info.split(",");  
			   
			   
			   System.out.println("person name: "+ strArr[0]+ " last name: "+ strArr[1]+ " age: "+ strArr[2]);

				
			
			}//end person
		  
		}


