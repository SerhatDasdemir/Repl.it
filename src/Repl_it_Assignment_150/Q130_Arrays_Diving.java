package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q130_Arrays_Diving {

	public static void main(String[] args) {


		 Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		    
		    for(int i=1; i<=score.length;i++) {
		    	System.out.println("Enter score for judge " +i+":");
		    	score [i-1]= input.nextFloat();
		    }
		    
		    System.out.println("Enter difficulty:");
		    float difficult = input.nextFloat();
		    
		    /*float smallNum = 10;
		    
		    for(int i=0;i<score.length;i++) {
		    	
		    	if(score[i]<smallNum) {
		    		smallNum=score[i];
		    	}
		    }
		    
		    
		    float bigNum = 0;
		    
		    for(int i=0; i<score.length;i++) {
		    	if(score[i]>bigNum) {
		    		bigNum=score[i];
		    	}
		    	
		    }*/
		    
		    
		    Arrays.sort(score);
		    float total=0;
		    for(int i=1;i<score.length-1;i++) {
		    	
		    	total=total+score[i];
		    }
		    
		    total=total*difficult*0.6F;
		    
		    // FINAL OUTPUT
		    System.out.printf("Total: %.2f", total);
	}

}
