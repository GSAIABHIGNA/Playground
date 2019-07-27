import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int c = in.nextInt();
      for(int i=1;c>0;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          c--;
        }
      }
	}
}