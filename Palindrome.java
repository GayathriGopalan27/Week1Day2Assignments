package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
  String   message = "Madam";
   String revMessage = "";
   
   for (int a=message.length()-1 ; a>=0 ; a--)
   {
   
	revMessage =revMessage+message.charAt(a);
	
	}
   
   System.out.println(revMessage);
   
   if (revMessage.equalsIgnoreCase(message ))
   {
	   System.out.println("String is palindrome  " + message);
   }
   
   else {
	   System.out.println("not palindrome  " +message);
   }

}
}
