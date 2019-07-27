import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int p=n;
      int s=0,f,r;
      while(p!=0)
      {
        r=p%10;
        f=1;
        for(int i=1;i<=r;i++)
          f=f*i;
        s=s+f;
        p=p/10;
      }
      if(s==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}