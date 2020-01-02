package Repl_it_Assignment_200;

public class Q164_MwithR8_simple_room_booking {
	
	public boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
	  {
		boolean x =false;
		
	
		if(isAvailable==false || month == 7 && day<8 ||year!=2018) {
			x=false;
		}else {
			x=true;
		}
		
		
		
		return x;
	    
	   
	  }
	}


