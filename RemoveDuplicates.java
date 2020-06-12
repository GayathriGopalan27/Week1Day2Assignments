package week1.day2;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
				String output ="";
		String [] splitmsg = text.split(" ");
		for (int i =0; i<splitmsg.length; i++)
			
		{
						
		//System.out.println(splitmsg[i]);
			
			for (int a =i+1; a<splitmsg.length; a++)
			{
				//System.out.println(splitmsg[i]);
				//System.out.println(splitmsg[a]);
			if (splitmsg[i].equalsIgnoreCase(splitmsg[a])) {
				
				//System.out.println(splitmsg[a]);
			 splitmsg[a]= " ";
				  
	
			  }
				
			}
			
			
			
		}
			
		
	for (int b=0;b<splitmsg.length;b++)
	{
		
	
		output= output+ splitmsg[b]+ " ";
		
	}
	System.out.println(output);

}
}
