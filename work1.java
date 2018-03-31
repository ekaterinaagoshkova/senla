import java.util.Scanner;

public class HelloWorld
{
  public static void main(String[] args)
  {
  	System.out.println("Enter: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        
        for (int P = 2; P < input; P++) {
 	    boolean b = true; 	       
            for (int i = 2; i < P; i++)
            {
                if (P % i == 0){
                    b = false;
                    break;
                }
                
            }
            ///
            if (b==true)
            	System.out.println(P+"-Simple");
        }
    	
  }
}
