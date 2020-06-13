package week1.day2;

public class OddUpper {

	public static void main(String[] args) {
		
		String text ="changeme";
		char [] a = text.toCharArray();
		String output = " ";
		
		for (int i=0; i<a.length; i++)
		{
		
			if (i%2==0)
			{
				
				char b  = Character.toUpperCase(a[i]);
				output =output+ b;
				
				
			}
			
			else {
				
				char b =a[i];
				output =output+ b;
			}
			
			
		}
		System.out.println( "upper case index  "+output);	
	
		
	}

}
