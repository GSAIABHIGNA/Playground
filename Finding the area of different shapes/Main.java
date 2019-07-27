import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int c = in.nextInt();
      switch(c)
      {
        case 1:
          int a = in.nextInt();
          System.out.println((a*a));
          break;
        case 2:
          int l = in.nextInt();
          int b = in.nextInt();
          System.out.println((l*b));
          break;
        case 3:
          int t = in.nextInt();
          int h = in.nextInt();
          System.out.println((0.5*t*h));
          break;
        case 4:
          int r = in.nextInt();
          System.out.println((3.14*r*r));
          break;
        default:
          System.out.println("Invalid");
      }
          
    }
}