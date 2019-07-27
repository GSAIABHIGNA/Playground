import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int a[][] = new int[n][m];
    int b[][]=new int[n][m];
    int s[][] = new int[n][m];
    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        a[i][j]=in.nextInt();
    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        b[i][j]=in.nextInt();
    for(int i=0;i<n;i++)
      for(int j=0;j<m;j++)
        s[i][j]=a[i][j]-b[i][j];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        System.out.print(s[i][j]+" ");
      }
      System.out.println();
    }
  }
}