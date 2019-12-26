package Repl_it_Assignment_150;

import java.util.Arrays;



public class Q117_Copy_Certain_Value {
	
	public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"e", "hey", "bye", "furey", "spoon"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  
		  
		  public static String[] getWithE(String[] arr) {
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
			  int b=0;
			  int a=0;
			  for(int i=0;i<arr.length;i++) {
				  if(arr[i].contains("e")) {
					  a++;
				  }
			  }
			  
			  String[] fewValues = new String [a];
			  for(int i=0;i<arr.length;i++) {
				  
				  if(arr[i].contains("e")) {
					 			
					fewValues [b]= "\""+arr[i]+"\"";
					 b++;
					  
				 
				  }
			  }
		    
		    
		    //YOUR CODE ENDS HERE -----------------------
		    
		   
			return fewValues;
		  }
		  

}
