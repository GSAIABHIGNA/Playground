import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int m=0,c=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==1)
          c++;
        else if(a[i]==0)
        {
          if(m<c)
            m=c;
          c=0;
        }
      }
      System.out.println(m);
    }
}