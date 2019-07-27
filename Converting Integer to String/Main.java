import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String s = new String("");
    StringBuilder sb = new StringBuilder(s);
    int f=0;
    if(n<0)
    {
      f=1;
    n=n*(-1);
    }
    while(n!=0)
    {
      char c = (char)((n%10)+'0');
      sb.append(c);
      n=n/10;
      }
    if(f==1)
    {
      char c='-';
      sb.append(c);
    }
    sb.reverse();
    System.out.println(sb);
  }
}