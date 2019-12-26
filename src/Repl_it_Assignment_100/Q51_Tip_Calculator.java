package Repl_it_Assignment_100;
import java.util.*;
public class Q51_Tip_Calculator {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Split:");
		String split = sc.nextLine();
		System.out.println("Number of people:");
		int people = sc.nextInt();
		String p = "&";
		for (int x=people;x>1;x--){
			  p = p+"&";
			}
		
		System.out.println("Check amount:");
		double amount = sc.nextDouble();
		
		
		System.out.println("Service Quality:");
		String quality = sc.next();
		
		double totalTip = 0;
		
		if (quality.equalsIgnoreCase("poor")) {
			 totalTip= amount*5/100;
		}else if (quality.equalsIgnoreCase("fair")) {
			 totalTip = amount*10/100;
		}else if (quality.equalsIgnoreCase("good")) {
			 totalTip = amount*15/100;
		}else if (quality.equalsIgnoreCase("great")) {
			 totalTip = amount*20/100;
		}else if (quality.equalsIgnoreCase("excellent")) {
			 totalTip = amount*25/100;
		}
		double totalPay = amount + totalTip;
		double totalperPerson = totalPay/people;
		double tipperPerson = totalTip/people;
		
		
		System.out.println("Number of people entered: "+p);
		System.out.println("Total to pay: "+totalPay);
		System.out.println("Total tip: "+totalTip);
		System.out.println("Total per person: " +totalperPerson);
		System.out.println("Tip per person: " + tipperPerson);
		
		
	}
}
