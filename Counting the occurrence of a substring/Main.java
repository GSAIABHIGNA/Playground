import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String s1 = in.nextLine();
    int c=0;
    int l=s1.length();
    for(int i=0;i<s.length()-1;i++)
    {
      int j=0,t=i,f=1;
      while(j<l)
      {
        if(s.charAt(t)!=s1.charAt(j))
        {
          f=0;
          break;
        }
        else
        {
        j++;
        t++;
        }
      }
      if(f==1)
      {
        c++;
      }
    }
    System.out.println(c);
      
        
  } 
}