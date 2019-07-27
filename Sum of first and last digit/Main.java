import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=n%10;
      int sum;
      int l=n%10;
      while(n!=0)
      {
        l=n%10;
        n=n/10;
      }
      sum=f+l;
      System.out.println(sum);
	    // Type your code here
	}
}