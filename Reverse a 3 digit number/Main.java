import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int r,v;
    v=0;
    while(n!=0)
    {
      r=n%10;
      v=(v*10)+r;
      n=n/10;
  }
    System.out.println(v);
}
}