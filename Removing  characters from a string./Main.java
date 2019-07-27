import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String s2 = in.nextLine();
    StringBuilder sb1 = new StringBuilder(s1);
    StringBuilder sb2 = new StringBuilder(s2);
    for(int i=0;i<sb2.length();i++)
    {
      for(int j=0;j<sb1.length();j++)
      {
        if(sb1.charAt(j)==sb2.charAt(i))
        {
          sb1.setCharAt(j,'$');
        }
      }
    }
    for(int i=0;i<sb1.length();i++)
    {
      if(sb1.charAt(i)!='$')
        System.out.print(sb1.charAt(i));
    }
    
  }
}