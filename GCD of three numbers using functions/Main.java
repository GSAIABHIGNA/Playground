import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      n1=gcd(n1,n2);
      System.out.println(gcd(n1,n3));
	}
  public static int gcd(int n1,int n2)
  {
    while(n1!=n2)
    {
      if(n1>n2)
        n1=n1-n2;
      else
        n2=n2-n1;
    }
    return n1;   
}
}