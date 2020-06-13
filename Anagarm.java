package week1.day2;

import java.util.Arrays;

public class Anagarm {
	
	public static void main(String[] args) {
		
		//""* Declare a String 
	      String text1 = "stops";
	 //* Declare another String
	      String text2 = "potss"; 
	      
	      if (text1.length()==text2.length())
	    	  
	      {
	    	  
	    	  
	    	  char [] t1= text1.toCharArray();
	    	  char [] t2 = text2.toCharArray();
	    	 
	       		  Arrays.sort(t1);  
	              Arrays.sort(t2); 
	    	  
	    	  if (Arrays.equals(t1, t2)) {
	    		  
	    		  System.out.println("both are anagram");
	    	  }
	    	  
	    	  else {
	    		  System.out.println(" not anagram");
	    	  }
	    	  
	      }
	      
	      else {
	    	  System.out.println(" String doesnt have same length of characaters not anagram");
	      }
		
	}

}
