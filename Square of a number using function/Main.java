import java.util.Scanner;
class Main
{
  public static int square(int nu)
  {
    return nu*nu;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int v=square(n);
      System.out.println(v);
	} 
}