import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=n%10;
    int l=n%10;
    while(n!=0)
    {
      l=f;
      f=n%10;
      n=n/10;
      
    }
    System.out.println(l);
  }
}