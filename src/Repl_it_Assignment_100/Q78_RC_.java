package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q78_RC_ {

	public static void main(String[] args) {
		//DO NOT CHANGE
	    	double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
			
	    //WRITE YOUR CODE HERE
		System.out.println("Enter your name");
		name= scan.next();
		
		System.out.println("Do you have a US driver license?");
		vehicleUsage=scan.next();
		if(!vehicleUsage.equalsIgnoreCase("Yes")) {
			System.out.println("Invalid data!");
			return;
		}
		
		System.out.println("Enter your zip code");
		int zip=scan.nextInt();
		
		switch (zip) {
		case 20910:
		case 20740:
			premium=60;
			break;
		case 22102:
		case 22103:
			premium=30;
			break ;
		default:
			premium=50;
		}
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership=scan.next();
		
		if(vehicleOwnership.equalsIgnoreCase("Owned")) {
			premium=premium+10;
		}else {
			premium=premium+20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage=scan.next();
		
		if(vehicleUsage.equalsIgnoreCase("Business")) {
			premium=premium+50;
		}else if(vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium=premium+10;
		}else if(vehicleUsage.equalsIgnoreCase("Commute")) {
			premium=premium+20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool=scan.nextInt();
			premium=premium+5*daysDrivenToWorkOrSchool;
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool=scan.nextInt();
			premium=premium+milesToWorkOrSchool;
			
		}
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if(age<16) {
			System.out.println("Invalid data!");
			return;
		}else if(age>=16 && age<18) {
			premium=premium+20;
		}else if(age>=18 && age<=21) {
			premium=premium+6;
		}else if(age>21 && age<25) {
			premium=premium+2;
		}
		
		System.out.println("How many years you've been driving?");
		milesToWorkOrSchool=scan.nextInt();
		
		if(milesToWorkOrSchool>0 && (age-milesToWorkOrSchool)>=16) {
			premium=premium-5*milesToWorkOrSchool;
		}else {
			System.out.println("Invalid data!");
			return;
		}
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String accident= scan.next();
		if(accident.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount=scan.nextInt();
			premium=premium*(1+0.2*accidentsAmount);
		}
			
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance=scan.next();
		if(continuousInsurance.equalsIgnoreCase("No")) {
			premium= premium*2;
		}
		
		System.out.println("What is the highest level of education you have completed?");
		scan.nextLine();
		education=scan.nextLine();
		switch (education) {
		case "PhD":
		case "Bachelors":
		case "Masters":
			premium=premium*0.95;
			break;
		case "Doctors":
			premium=premium*0.90;
			break;
		case "Less than High School":
			premium=premium*1.05;
			break;	
		}
		
		referenceNumber=name.substring(0, 2)+ age + name.substring(name.length()-2, name.length()) + zip + education.replace(" ", "");
		
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		System.out.println("Reference number: " + referenceNumber.toUpperCase());


	}

}
