import java.util.Scanner;

public class HelloWorld
{
  public static int gcd_1(int a, int b) {
	if (b == 0)
		return a;
	return gcd_1(b, a % b);
  }
  ///
  static long lcm(long a,long b){
	return a / lcm(a,b) * b;
  }	
  public static void main(String[] args)
  {
  	System.out.println("Enter 2 number");
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        
        System.out.println("gcd=" + gcd_1(a1,a2));
        System.out.println("lcm=" + lcm(a1,a2));
        
        
    	
  }
}

