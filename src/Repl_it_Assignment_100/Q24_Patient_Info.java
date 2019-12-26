package Repl_it_Assignment_100;
import java.util.*;
public class Q24_Patient_Info {

	public static void main(String[] args) {
		
		    //Enter your code here
		    
		    System.out.println ("Welcome to the patient portal!");
		    System.out.println ("Please enter your personal information");
		    
		    Scanner sc= new Scanner (System.in);
		    
		    
		    String firstName, lastName, fullName, email, street, state, city, address, contacts;
		    int  age, zipcode;
		    double  height, weight;
		    boolean isMarried;
		    long  workPhoneNumber, personalPhoneNumber;
		    
		    	System.out.println ("Enter your first name :");
				 firstName = sc.next();
				
				System.out.println ("Enter your last name :");
				 lastName = sc.next();
				
				System.out.println ("Enter your E-Mail :");
				email = sc.next();
				
				System.out.println ("Enter your street :");
				street = sc.next();
				
				System.out.println ("Enter your city :");
				city = sc.next();
				
				System.out.println ("Enter your state :");
				state = sc.next();
											
				System.out.println ("Enter your zip code :");
				zipcode = sc.nextInt();
											
				System.out.println ("Enter your work phone number :");
				 workPhoneNumber = sc.nextLong();
				
				System.out.println ("Enter your personal phone number :");
				 personalPhoneNumber = sc.nextLong();
				 
				 System.out.println ("Enter your age :");
				 age = sc.nextInt();

				System.out.println ("Enter your height :");
				height = sc.nextDouble();

				 System.out.print("Enter your weight :");
				 weight=sc.nextDouble();
					
				System.out.print ("Are you married? :");
				 isMarried = sc.nextBoolean();
				 
				 fullName = lastName+", "+firstName;
				 address =""+ street+ ", " + city + ", " +  state +" "+ zipcode;
				 contacts = "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber +", email: "+ email;
		   
			System.out.println ("Patient personal information");
		    System.out.println ("Full name : " + fullName);
		    System.out.println ("Address : " + address);
		    System.out.println ("Contacts : "+ contacts);
		    System.out.println ("Age: "+age);
		    System.out.println ("Height: "+ height);
		    System.out.println ("Weiht: "+weight+" pounds");
		    System.out.println ("Married?: "+ isMarried);

	}

}
