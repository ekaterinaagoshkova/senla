import java.util.Scanner;

public class HelloWorld
{
 
  
  public static void main(String[] args)
  {
  	System.out.println("Enter text -");
        Scanner in = new Scanner(System.in);
        String phrase1 = in.nextLine();
        
         System.out.println(phrase1.replaceAll("\\d",""));
        
        
    	
  }
}

