import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
  public static void prime(int n)
  {
    int f;
    for(int i=2;i<=n;i++)
    {
      f=0;
      for(int j=2;j<=i/2;j++)
      {
        if(i%j==0)
        {
          f=1;
          break;
        }
      }
      if(f==0)
        System.out.println(i);
    }
}
}