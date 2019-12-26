package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q138_Array_Zombi {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		    
		    boolean[] zombi=new boolean[8];
	        int[] nullArray = new int[8];
	        int x=0;
	        while (!Arrays.equals(nullArray,inhabitants)){
	            System.out.println("Day "+ x + " " + Arrays.toString(inhabitants));
	            x++;

	            for(int i=0; i<inhabitants.length; i++){
	                if(inhabitants[i]==0){
	                    zombi[i]=true;
	                }
	            }
	            for(int j=0; j<inhabitants.length; j++) {
	                if(j==0){
	                    if(zombi[1]){
	                        inhabitants[0]=inhabitants[0]/2;
	                    }
	                }else if(j>0 &&j<7){
	                    if(zombi[j-1] || zombi[j+1]){
	                        inhabitants[j]=inhabitants[j]/2;
	                    }
	                }else if(j==7){
	                    if(zombi[6]){
	                        inhabitants[7]=inhabitants[7]/2;
	                    }
	                }
	            }
	        }
	        System.out.println("Day "+ x + " " + Arrays.toString(inhabitants));
	        System.out.println("---- EXTINCT ----");
		    

	}

}
