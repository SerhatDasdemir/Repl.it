package Repl_it_Assignment_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q121_shortesWord2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();

		
	    
	    String[] strArr= null;
	    strArr = str.split(", ");   
	    
	   
	    int x = Integer.MAX_VALUE;
	    
	   
	   
	    String word = null;
	    
	    
	  for (int i=0; i<strArr.length;i++) {
		  
		  if(strArr[i].length()<x) {
			  word = strArr[i];
			  
			  x=strArr[i].length();
			
 
		  }

		  
	  }
	  int z=0;
	  for (String each : strArr) {
	  if(word.length() == each.length()) {
		  z++;
	  }
	   
		//volt, olive, fish, hot pursuit, warning, python, java, coffee, part
	  //[fish, java, part, volt]
		  }
	  
	  
	  String[] result = new String[z];
	 
	  int y=0;
	  for (int i=0; i<strArr.length;i++) {
		
		  if(word.length() == strArr[i].length()) {
			  
			  result[y]=strArr[i];
			  y++;
			  
		  }
	
	}		
	  Arrays.sort(result);
	 
	  System.out.println(Arrays.toString(result));
}
}