import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int l=a[0];
      for(int i=1;i<n;i++)
        if(l<a[i])
          l=a[i];
      System.out.println(l);
    }
}