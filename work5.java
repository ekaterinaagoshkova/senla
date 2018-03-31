import java.util.Scanner;

public class HelloWorld
{
  public static boolean isPalindrome(String text) {
    return text.equalsIgnoreCase(new StringBuilder(text)
               .reverse().toString());
 }
  
  public static void main(String[] args)
  {
  	System.out.println("Enter word");
        Scanner in = new Scanner(System.in);
        String phrase1 = in.nextLine();
        
        if (isPalindrome(phrase1))
        	System.out.println("Palin");
        	else
        	System.out.println("Not");
        
       
        
        
    	
  }
}
