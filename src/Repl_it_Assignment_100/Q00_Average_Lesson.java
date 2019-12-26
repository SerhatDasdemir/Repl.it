package Repl_it_Assignment_100;
import java.util.Scanner;
public class Q00_Average_Lesson {

	public static void main(String[] args) {
		{
		    // Enter your code here
		    Scanner sc = new Scanner (System.in);
		    
		  String subject1,  subject2, subject3,  subject4, subject5, summary;
		  double grade1,  grade2, grade3,  grade4, grade5, average; 
		  
		System.out.println ("Welcome to the Grader!");
		  
		System.out.println ("Please enter subject name number 1 and score for this subject");
		 
		subject1 = sc.next();
		grade1 = sc.nextDouble();

		System.out.println("Please enter subject name number 2 and score for this subject");
		subject2 = sc.next();
		grade2 = sc.nextDouble();

		System.out.println ("Please enter subject name number 3 and score for this subject");
		subject3 = sc.next();
		grade3 = sc.nextDouble();
		System.out.println ("Please enter subject name number 4 and score for this subject");
		subject4 = sc.next();
		grade4 = sc.nextDouble();
		System.out.println ("Please enter subject name number 5 and score for this subject");
		subject5 = sc.next();
		grade5 = sc.nextDouble();

		summary = subject1 +" - " + grade1 + ", "+ subject2 + " - " + grade2 + ", " + subject3 + " - "+ grade3 + ", " + subject4 + " - " + grade4 + ", "+ subject5   + " - "+  grade5;
		average = (grade1 +  grade2 + grade3 +  grade4 + grade5)/5;

		System.out.println ("Summary:" + summary);
		System.out.println ("Your average score is: " + average);
		System.out.println ("Thank you for using Grader!");
		System.out.println ("Goodbye!");
		    
		  }	

	}

}
