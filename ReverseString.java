package week1.day2;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String message = "I am a software tester";
		String [] splitmsg = message.split(" ");
		System.out.println(splitmsg.length);
		String outString = "";
		
		for (int i = 0; i < splitmsg.length; i++)
        {
           String word = splitmsg[i]; 
           String revWord = "";
           if (i%2!=0) {
           for (int a = word.length()-1; a >= 0; a--) 
	   {
		
        	   revWord = revWord + word.charAt(a);
	   }
           outString = outString + revWord + " ";
	}
           else {
        	   outString = outString+ word+" ";
        	   
           }
        }
		
	
	System.out.println(outString);
		}
	}

