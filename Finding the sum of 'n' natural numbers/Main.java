import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(su(n));
    }
  public static int su(int n)
  {
    if(n==0)
    {
      return 0;
    }
    else
    {
      return n+su(n-1);
    }
  }
}