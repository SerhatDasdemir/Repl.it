package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q137_2D_Arrays_Larges_Num {

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
		    int basNum = 0;
		    
		    for(int i=0;i<rows;i++) {
		    	for(int j=0;j<cols;j++) {
		    		
		    		if(arr[i][j]>basNum) {
		    			basNum=arr[i][j];
		    		}
		    		
		    		
		    	}
		    }
		    
		    for(int i=0;i<rows;i++) {
		    	for(int j=0;j<cols;j++) {
		    		
		    		arr[i][j] = basNum;
		    		
		    	}
		    	}
		    
		    //FINAL PRINT
		    System.out.println(Arrays.deepToString(arr));
	}

}
