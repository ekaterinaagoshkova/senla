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
  	System.out.println("Enter first coords & seconds: ");
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int c1,c2;
        
        if (b1<a1){
           c1=a1; c2=a2;
           ///
           a1=b1; a2=b2;
           //
           b1=c1; b2=c2;
        }
        //////////////
        if ((b1>=a1) && (b1<=a2) && (b2>=a1))
        	System.out.println("Intersect!");
        else
        System.out.println("NOT!");
    	
  }
}
