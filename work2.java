import java.util.Scanner;

public class HelloWorld
{
   static int fib(int i) {
    if (i == 1) return 1;
    if (i == 2) return 1;
    return fib(i - 1) + fib(i - 2);
  }
  ///
  public static void main(String[] args)
  {
  	System.out.println("Enter: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        
        for (int P = 1; P <= input; P++) {
 	    ///
            System.out.println("Fibb "+ P+" - " + fib(P));
        }
    	
  }
}
