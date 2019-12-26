package Repl_it_Assignment_150;

import java.util.*;

public class Q122_Arrays_Zombie {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int x = 0;
	    
	    System.out.println("Day "+ 0 +" "+ Arrays.toString(inhabitants));
	    
	    for(int i=0;i<inhabitants.length;i++) {

			    	x++;
			    	for(int a=0; a<inhabitants.length;a++) {
			    	inhabitants[a] =inhabitants[a]/2;
			    	}
			    	
			    	System.out.println("Day "+ x + " "+ Arrays.toString(inhabitants));
			    	
			    	
			    	if(inhabitants[0] == 0 && inhabitants[1] == 0 && inhabitants[2] == 0 && inhabitants[3] == 0 && 
			    	   inhabitants[4] == 0 && inhabitants[5] == 0 && inhabitants[6] == 0 && inhabitants[7] == 0    ){
			    		
			    		 System.out.println("---- EXTINCT ----");
			    		
			    		break;
			    	}
			    	
		    
	   
		}
	}
}

	    
	    
	    
	


