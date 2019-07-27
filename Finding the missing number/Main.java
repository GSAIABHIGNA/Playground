import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int t=1;
      while(t<=n)
      {
        int f=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]==t)
          {
            f=1;
            break;
          }
        }
        if(f==0)
          System.out.print(t);
        t++;
      }
          
    }
}