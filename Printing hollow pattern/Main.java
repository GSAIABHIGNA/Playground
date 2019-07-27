import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {
          if(i==1 || i==n)
          {
            for(int k=0;k<n;k++)
              System.out.print("*");
            System.out.println();
          }
        else
        {
          System.out.print("*");
          for(int t=1;t<=n-2;t++)
            System.out.print(" ");
          System.out.print("*");
          System.out.println();
        }
      }
          
            
	}
}