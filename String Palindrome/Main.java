import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      StringBuilder sb = new StringBuilder(s);
      int l = sb.length();
      int i=0,j=l-1;
      int f=1;
      while(i<j)
      {
        if(sb.charAt(i)!=sb.charAt(j))
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