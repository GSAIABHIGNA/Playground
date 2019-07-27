import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      seg(a,n);
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
      
    }
  public static void seg(int a[],int n)
  {
    int b[]=new int[n];
    int j=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]!=0)
      {
        b[j]=a[i];
        j++;
      }
    }
    for(int i=0;i<j;i++)
      a[i]=b[i];
    for(int i=j;i<n;i++)
      a[i]=0;
  }
}