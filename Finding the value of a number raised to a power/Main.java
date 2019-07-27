import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int t = b;
      int e = in.nextInt();
      while(e>1)
      {
        b=b*t;
        e--;
      }
      System.out.println(b);
    }
}