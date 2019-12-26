package Repl_it_Assignment_150;

import java.util.Arrays;

public class Q134_Arrays_ChessBoard {

	public static void main(String[] args) {
		
		 String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		 String [] latter = {"a","b","c","d","e","f","g","h"};
		 int [] num = {1,2,3,4,5,6,7,8};
		    for(int i=0;i<chessBoard.length;i++) {
		    	for(int j=0;j<chessBoard.length;j++) {
		    		
		    		chessBoard[i][j]=num[i]+ latter[j];
		    		
		    	}
		    }
		 
		 
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
	}

}
