package Repl_it_Assignment_100;
import java.util.Scanner;
public class Q30_Seconds_Converter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter seconds:");
		int inputSeconds = sc.nextInt();
		
		int hours = inputSeconds/3600;
		int minutes = (inputSeconds%3600)/60;
		int seconds= (inputSeconds%3600)%60;
		
		System.out.println(hours +  " hours, "+ minutes + " minutes, and "+ seconds +" seconds");
    
		
	}

}
