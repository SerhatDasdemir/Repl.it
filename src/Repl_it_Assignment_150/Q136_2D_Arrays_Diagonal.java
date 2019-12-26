package Repl_it_Assignment_150;

import java.util.Arrays;
import java.util.Scanner;

public class Q136_2D_Arrays_Diagonal {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	    result = (matrix [0][0] + matrix[1][1]+matrix [2][2]) - (matrix[0][2]+matrix[1][1]+matrix[2][0]);
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
	    System.out.println(Arrays.deepToString(matrix));
	    
	}

}
