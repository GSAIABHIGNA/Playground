import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int m = che(a,n);
    System.out.println(m);
  }
  public static int che(int a[],int n)
  {
    int max=0;
    for(int i=1;i<n;i++)
    {
      if(a[max]<a[i])
        max=i;
    }
    return max;
  }
}