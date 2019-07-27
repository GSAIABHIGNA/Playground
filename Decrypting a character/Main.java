import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int k = in.nextInt();
      if(ch>='a' && ch<='z')
      {
        ch = (char)(ch+(26-k));
      }
      else if(ch>='A' && ch<='Z')
      {
        int o =ch-'A';
        o=(o-k)%26;
        ch=(char)(o+'A');
      }
      System.out.println(ch);
    }
}