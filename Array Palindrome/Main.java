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
      int i=0,j=n-1,f=1;
      while(i<=j)
      {
        if((a[i]!=a[j]) && i!=j)
        {
          f=0;
          break;
        }
        i++;
        j--;
      }
      if(f==1)
        System.out.println("Yes");
      else
        System.out.println("No");
        
    }
}