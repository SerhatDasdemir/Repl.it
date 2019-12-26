package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q115_Finding_Max_Length {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		
		

		
		for(int x=0;x<words.length;x++) {
				int a=0;
			for(int y=0;y<words.length;y++) {
				if (words[x].length()>words[y].length()) {
					a++;
					
				}
					
				
			}
			if(a>=4) {
				System.out.println(words[x]);
				break;
				
			}
		
		
			}
		
		
		}
		
		
		
	}


