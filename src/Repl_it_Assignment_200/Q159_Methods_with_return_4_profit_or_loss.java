package Repl_it_Assignment_200;

public class Q159_Methods_with_return_4_profit_or_loss {
	
	 public String c_profits (int buyPrice,int sellPrice)
	  {
	
		 
	    //your code here
		 
		 String str = "";
	   if(buyPrice>sellPrice) {
		   str = "profit";
	   }else if(buyPrice<sellPrice) {
		   str="loss";
	   }else if(buyPrice==sellPrice) {
		   str="no loss";
	   }
	   
	   	return str;
	  }
	}


