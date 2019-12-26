package Repl_it_Assignment_150;

public class Q116_UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] utopian = new int[10];
		int a=0;
		for(int i=1;i<utopian.length+1;i++) {
			
			if(i<4) {
				a++;
				System.out.println("year"+ (i)+ "- growth "+1 +" cm");
				System.out.println("tree size: "+(a)+"cm");
				
			}else if(i>3){
				a=a+2;
				System.out.println("year"+ (i)+ "- growth "+2 +" cm");
				System.out.println("tree size: "+(a)+"cm");
			}
			
		}
		
	}

}
