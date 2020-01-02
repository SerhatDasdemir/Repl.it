package Repl_it_Assignment_200;

public class Q163_MwithR8_validate_task {
	
	
	 public boolean validateTask(boolean notEmpty,int taskId,int currentId){
		 
		 boolean x=true;
		 
		 if(notEmpty==true && taskId == currentId+1) {
			 
			 x=true;
		 }else {
			 x=false;
		 }
		 
		 
		 
		return x;
	    
	    
	  }
	}