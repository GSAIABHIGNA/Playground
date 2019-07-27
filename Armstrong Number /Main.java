import java.util.Scanner;

class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=0;
      double s=0,t;
      int p=n;
      int r;
      while(p>0)
      {
        c++;
        p=p/10;
      }
      p=n;
      while(p>0)
      {
        r=p%10;
        t=r;
       // t=Math.pow(r,c);
        for(int i=1;i<c;i++)
          t=t*r;
     
        s=s+t;
        p=p/10;
      }
      if(s==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	   // Type your code here
	}
}