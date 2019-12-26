package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q33_Citizen {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		int seniorCitizens, nonSeniorCitizens, age;
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens = sc.nextInt();
		nonSeniorCitizens = sc.nextInt();
		
		System.out.println("What is new citizen's age?");
		age = sc.nextInt();
		
		if (age >=65) {
			System.out.println("Senior Citizen");
			seniorCitizens++;
		}else if (age<65) {
			System.out.println("Non-Senior Citizen" );
			nonSeniorCitizens++;
		}
		
		System.out.println("New seniorCitizens count " + seniorCitizens+ "\n" + "New nonSeniorCitizens count "+ nonSeniorCitizens);

	}

}
