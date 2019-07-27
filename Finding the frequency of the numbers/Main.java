import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int a[] = new int [n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      for(int i=1;i<=k;i++)
      {
        int c=0;
        for(int j=0;j<n;j++)
        {
          if(a[j]==i)
            c++;
        }
        System.out.println(i+" "+c);
      }
    }
}