package Repl_it_Assignment_100;

import java.util.Scanner;

public class Q56_LaptopConfigurator {

	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
		Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE
		
		System.out.println("Select screen size:");
		screenType = scan.nextLine();
		switch (screenType) {
		case "13.3":
			price = price+200;
			break;
		case "15":
			price = price+300;
			break;
		case "17.3":
			price = price+400;
			break;
		default:
			System.out.println("Error!");
			
		}
		
		System.out.println("Select CPU type:");
		cpu = scan.nextLine();
		switch (cpu) {
		case "i3":
			price = price+150;
			break;
		case "i5":
			price = price+250;
			break;
		case "i7":
			price = price+350;
			break;
		default:
			System.out.println("Error!");
			
		}
		
			
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		int r = ram/4;
		price = price + 50*r;
		
		System.out.println("Select storage type:");
		storageType = scan.next();
		
		
		System.out.println("Enter memory size:");
		int memorySize = scan.nextInt();
		
		int x = memorySize/500;
		
		switch (storageType) {
		
		case "SSD":
			price = price+(100*x);
			break;
		case "HDD":
			price = price+(50*x);
			break;
		default:
			System.out.println("Error!");
			
		}

		System.out.println("Enter screen resolution:");
		String screen = scan.next();
		
		switch (screen) {
		
		case "FULLHD":
			price = price+100;
			break;
		case "4K":
			price = price+200;
			break;
		default:
			System.out.println("Error!");
			
		}	

			System.out.println("Laptop price is: $" + price);

	}

}
