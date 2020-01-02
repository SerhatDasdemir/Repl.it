package Repl_it_Assignment_200;

public class Q166_Methods_with_String1_merge_them {
	
	 public static String mergeStrings(String one, String two) {
		 
		 String str ="";
		 int x=0;
		  int a=0;
		 if(one.length()>two.length()) {
			 x=two.length();
			 for(int i =0; i<x;i++) {
					 
					str =str +  one.charAt(i)+two.charAt(a);
					a++;
			 }
				str=str+one.substring(x);
				 
		 }else if (one.length()<=two.length()) {
			 x=one.length();
		 
			 for(int i =0; i<x;i++) {
				 			 
					str =str +  one.charAt(a)+two.charAt(i);
					a++;
				 
				 
		 }
			str=str+two.substring(x); 
		 
		 }
		 
			return str;
		    
	  }
	 public static void main(String[] args) {
		
		 System.out.println(mergeStrings("wwwwwwwwww", "spoon"));
	}
	}