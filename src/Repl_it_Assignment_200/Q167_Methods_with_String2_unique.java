package Repl_it_Assignment_200;

public class Q167_Methods_with_String2_unique {
	
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("java") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
		
	    //TODO: write your below
		  
		 String x="";
		String [] list = str.split("");
		 
		 for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(list[i].equals(list[j])) {
					
				list[j]="";
					
				}
				
				
			}
			 
			 x=x+list[i];
			 
		 }
		 
		  
	   return x; 
	   
	  
	  }}