import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int f=1;
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = in.nextInt();
    int t=a[0]+a[1]+a[2];
    che(a,n,t);
    
  }
  public static void che(int a[],int n,int t)
  {
    int i=3;
    int f=1;
    while(i<n)
    {
      int p=3,s=0;
      while(p!=0)
      {
        s=s+a[i];
        i++;
        p--;
      }
      if(s!=t)
      {
        f=0;
        System.out.println("Not a Perfect Batch");
        break;
      }
    }
    if(f==1)
      System.out.println("Perfect Batch");
    return;
  }
        
      
        
}