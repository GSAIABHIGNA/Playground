import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int n1=in.nextInt();
      int n2=in.nextInt();
      int i1=-1,i2=-1;
      for(int i=0;i<n;i++)
      {
        if(a[i]==n1)
          i1=i;
        if(a[i]==n2)
          i2=i;
      }
      System.out.println(i1+"\n"+i2);
    }
}