package Repl_it_Assignment_200;

public class Q168_MwS3_cover {
	
	public static void main(String[] args) {
	    System.out.println(coverString("java methods", "hod") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  
		  String x="";
		  
		  if(main.contains(coverME)) {
			  
			   x= "["+coverME+"]";
			   main= main.replace(coverME, x);

		  }else {
			  main="["+main+"]"; 
		  }


		  	
		  
		return main;
	    
	    
	  }
	  
	

}
