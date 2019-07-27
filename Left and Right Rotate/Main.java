import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int i=0,j=0,k=0,p=0,temp=0,t=0,temp1=0;
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    int o[] = new int[n];
      int e[] = new int[n];
    int r=in.nextInt();
    for(i=0;i<n;i++)
    {
      if(i%2==1)
      {
        e[k]=a[i];
        k++;
      }
      else
      {
        o[j]=a[i];
        j++;
      }
    }
    for(t=0;t<r;t++)
    {
      temp=o[j-1];
      for(i=j-2;i>=0;i--)
      {
        o[i+1]=o[i];
      }
      o[0]=temp;
      temp1=e[0];
      for(p=1;p<k;p++)
      {
        e[p-1]=e[p];
      }
      e[p-1]=temp1;
    }
    j=0;
    k=0;
    for(i=0;i<n;i++)
    {
      if(i%2==1)
      {
        a[i]=e[j];
        j++;
      }
      else
      {
        a[i]=o[k];
        k++;
      }
    }
    for(i=0;i<n;i++)
      System.out.print(a[i]+" ");
    
  	}
}