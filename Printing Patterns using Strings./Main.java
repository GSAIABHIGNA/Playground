import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    StringBuilder sb1 = new StringBuilder(s);
    StringBuilder sb2 = new StringBuilder("");
    int l = sb1.length();
    int m = l/2;
    for(int i=m;i<l;i++)
      sb2.append(sb1.charAt(i));
    for(int i=0;i<m;i++)
      sb2.append(sb1.charAt(i));
    for(int i=0;i<l;i++)
    {
      //int t=l-i;
      for(int j=l-i-1;j>0;j--)
        System.out.print(" ");
      for(int k=0;k<=i;k++)
        System.out.print(sb2.charAt(k));
      System.out.println();
    }
    
  }
}