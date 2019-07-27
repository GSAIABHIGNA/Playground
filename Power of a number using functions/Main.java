import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    double a=in.nextInt();
    double b=in.nextInt();
    double p=po(a,b);
    System.out.println(p);
  }
  public static double po(double b,double e)
  {
    double s=Math.pow(b,e);
    return s;
  }
}

    