import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s=in.nextLine();
      StringBuilder s1 = new StringBuilder(s);
      int a[]=new int[26];
      for(int i=0;i<26;i++)
        a[i]=0;
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
        {
          int o = s1.charAt(i)-'a';
          a[o]++;
        }
        else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
        {
          int o=s1.charAt(i)-'A';
            a[o]++;
        }
      }
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
        {
          if(a[s1.charAt(i)-'a']!=0)
          System.out.print(s1.charAt(i)+""+a[s1.charAt(i)-'a']+" ");
          a[s1.charAt(i)-'a']=0;
        }
        else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
        {
          if(a[s1.charAt(i)-'A']!=0)
          {
            char ch=s1.charAt(i);
            ch=(char)(ch+32);
            s1.setCharAt(i,ch);
          System.out.print(s1.charAt(i)+""+a[s1.charAt(i)-'a']+" ");
            a[s1.charAt(i)-'a']=0;
          }
        
        }
      }
    }
}