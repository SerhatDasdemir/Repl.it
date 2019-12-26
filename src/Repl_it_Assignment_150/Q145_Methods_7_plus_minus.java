package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q145_Methods_7_plus_minus {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main
	  
	public static void plus_minus (int arr[]){
		
		int neg = 0;
		int poz = 0;
		int zero= 0;
		
		for (int i = 0; i<arr.length;i++) {
			
			if(arr[i]>0) {
				poz++;
			}else if (arr [i]<0) {
				neg++;
			}else if (arr [i] ==0) {
				zero++;
			}
		}
		
		System.out.println("positives:"+poz+", "+ "negatives:"+neg+", "+ "zeros:"+zero);
	}
	  
	}
