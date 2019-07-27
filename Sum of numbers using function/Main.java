import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int s=sum(n);
      System.out.println(s);
	}
  public static int sum(int n)
  {
    int su=0;
    for(int i=1;i<=n;i++)
      su=su+i;
    return su;
  }
}