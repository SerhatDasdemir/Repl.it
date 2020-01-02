package Repl_it_Assignment_200;



public class Q165_MwithR8_thunder_blazz {

	public boolean getThunderBlazz(boolean available,boolean gift, int ingredient1, int ingredient2, int ingredient3){
		
		boolean x=false;
		int [] i = {ingredient1,ingredient2,ingredient3};
		
		
		if(available == true || gift == true ) {
			x=true;
		}else if (ingredient1 == 1 && ingredient2 == 2 && ingredient3==3 || ingredient1==2 && ingredient2 ==1 && ingredient3 ==3 ||
				ingredient1 ==3 && ingredient2==1 && ingredient3 ==2 || ingredient1 ==2 && ingredient2 == 3 && ingredient3==1){
			x=true;
			
			
		}else {
			x=false;
		}
		
		
		
				return x;
			    
			    
			    
			  }
			
}