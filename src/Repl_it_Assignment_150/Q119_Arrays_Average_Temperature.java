package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q119_Arrays_Average_Temperature {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
  
		k=temps.length;
		
		for(int i=0;i<k;i++) {
			
			total=total+temps[i];
			
		}
			avgTemp = total/k;
			System.out.println(avgTemp);
	}

}
