package Repl_it_Assignment_150;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Q127_2D_Array_LargestNumber {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    
	    int[][] arr = new int[rows][cols];
	    
	    
	    for(int i=0 ;i<=rows-1;i++){
	    	
	    	for(int j=0 ;j<=cols-1;j++){
	    	  
	    			arr[i][j]=inp.nextInt();
	        
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
	    
	    int x=0;
	    
	    	for(int i=0 ;i<=rows-1;i++){
	    	
	    		for(int j=0 ;j<=cols-1;j++){
	    			
	    			if(arr[i][j]>=x) {
	    				
	    				x=arr[i][j];
	    			}
	    			
	    		}
	    	}
	    
	   System.out.println(x);
	  }//end main
	
	}


