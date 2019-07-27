import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      StringBuilder s1 = new StringBuilder(s);
      for(int i=0;i<s1.length();i++)
      {
        char c = s1.charAt(i);
        if(c>='A' && c<='Z')
        {
          c=(char)(c+32);
          s1.setCharAt(i,c);
        }
      }
      
    char ch='a';
      while(ch<='z')
      {
        int f=0;
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)==ch)
        {
          f=1;
          break;
        }
      }
        if(f==0)
          System.out.print(ch+" ");
        ch=(char)(ch+1);
      }
      
    }
}