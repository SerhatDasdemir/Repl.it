package Repl_it_Assignment_200;

public class Q200_Methods_with_Arrays_3_switch_elements {
	
	public static int[] do_switch(int[] i) {
		
		int x=i[0];
		int y=i[i.length-1];
		
		i[0]=y;
		i[i.length-1]=x;
		
		
		
		return i;

		}
	}