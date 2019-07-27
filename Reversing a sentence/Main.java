import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String sb = in.nextLine();
  int i=0;
      int l=sb.length()-1;
      reverse_string(sb,i,l);
    }
    // Function to reverse a string
    public static void reverse_string(String sb, int t, int j)
    {
        // Type your code here
      String a[] = sb.split(" ");
      sb=" ";
      for(int i=a.length-1;i>=0;i--)
      {
        sb=sb+(a[i]+" ");
      }
      
   System.out.println(sb.trim());
    }
    
}