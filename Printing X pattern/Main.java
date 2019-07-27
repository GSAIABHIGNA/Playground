import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int s=n-2;
      int s1=1;
      for(int i=1;i<=(n/2);i++)
      {
        for(int j=1;j<i;j++)
          System.out.print(" ");
        System.out.print("*");
        for(int j=1;j<=s;j++)
          System.out.print(" ");
        System.out.print("*");
        System.out.println();
        s=s-2;
      }
      for(int i=0;i<n/2;i++)
        System.out.print(" ");
      System.out.print("*");
      System.out.println();
      s=n/2;
      s--;
      for(int i=1;i<=(n/2);i++)
      {
        for(int j=1;j<=s;j++)
          System.out.print(" ");
        System.out.print("*");
        for(int j=1;j<=s1;j++)
          System.out.print(" ");
        System.out.print("*");
        System.out.println();
        s1=s1+2;
        s--;
      }
	}
}