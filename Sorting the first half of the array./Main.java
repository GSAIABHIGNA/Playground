import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int m = n/2;
    for(int i=0;i<m;i++)
    {
      for(int j=i+1;j<m;j++)
      {
        if(a[j]<a[i])
        {
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}