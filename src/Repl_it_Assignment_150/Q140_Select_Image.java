package Repl_it_Assignment_150;

import java.util.Scanner;

public class Q140_Select_Image {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("select image: \r\n" + 
				" 1)sunset \r\n" + 
				" 2)earth \r\n" + 
				" 3)desert  ");
		int select = sc.nextInt();
		
		if (select == 1) {
			printSunset();
		}else if(select == 2) {
			printEarth();
		}else if(select == 3) {
			printDesert();
		}
		
		
		   
		   
	  }
	  
	  public static void printSunset()
	  {
	       System.out.print("_\\/_                 |                _\\/_\r\n" + 
		     		"/o\\\\             \\       /            //o\\\r\n" + 
		     		" |                 .---.                |\r\n" + 
		     		"_|_______     --  /     \\  --     ______|__\r\n" + 
		     		"1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
	  }//end print_sunset
	  
	   public static void printEarth()
	  {
	    
	       System.out.print("22        _____\r\n" + 
		     		"    ,-:` \\;',`'-, \r\n" + 
		     		"  .'-;_,;  ':-;_,'.\r\n" + 
		     		" /;   '/    ,  _`.-\\\r\n" + 
		     		"| '`. (`     /` ` \\`|\r\n" + 
		     		"|:.  `\\`-.   \\_   / |\r\n" + 
		     		"|     (   `,  .`\\ ;'|\r\n" + 
		     		" \\     | .'     `-'/\r\n" + 
		     		"  `.   ;/        .'\r\n" + 
		     		"jgs `'-._____.");
	    
	  }//print_earth
	  
	   public static void printDesert()
	  {
	   
	     System.out.print(" 33   .    _    +     .  ______   .          .\r\n" + 
		     		" (      /|\\      .    |      \\      .   +\r\n" + 
		     		"     . |||||     _    | |   | | ||         .\r\n" + 
		     		".      |||||    | |  _| | | | |_||    .\r\n" + 
		     		"   /\\  ||||| .  | | |   | |      |       .\r\n" + 
		     		"__||||_|||||____| |_|_____________\\__________\r\n" + 
		     		". |||| |||||  /\\   _____      _____  .   .\r\n" + 
		     		"  |||| ||||| ||||   .   .  .         ________\r\n" + 
		     		" . \\|`-'|||| ||||    __________       .    .\r\n" + 
		     		"    \\__ |||| ||||      .          .     .\r\n" + 
		     		" __    ||||`-'|||  .       .    __________\r\n" + 
		     		".    . |||| ___/  ___________             .\r\n" + 
		     		"   . _ ||||| . _               .   _________\r\n" + 
		     		"_   ___|||||__  _ \\\\--//    .          _\r\n" + 
		     		"     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" + 
		     		"_  ^      .  -    . \\.|");
	    
	  }//end
	  
	  
	}