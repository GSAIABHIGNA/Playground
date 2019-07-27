//import required packages
import java.util.Scanner;
class Faculty
{
  public long sal;
  public void setSal(long s)
  {
    this.sal = s;
  }
  public void salary()
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+this.sal);
  }
}
class CSE extends Faculty
{
public CSE(long s)
{
this.sal = s;
}
  public void salary()
  {
  this.sal = this.sal+3000;
  System.out.println("CSE Faculty: "+this.sal);
    //write your CSE class statements
  }
}
class IT extends Faculty
{
public IT(long s)
{
this.sal = s;
}
  public void salary()
  {
  this.sal = this.sal+5000;
  System.out.println("IT Faculty: "+this.sal);
    //write your IT class statements
  }
}
class ECE extends Faculty
{
public ECE(long s)
{
this.sal = s;
}
  public void salary()
  {
    this.sal = this.sal+4500;
    System.out.println("ECE Faculty: "+this.sal);
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    long s = in.nextLong();
    Faculty f = new Faculty();
    f.setSal(s);
    CSE o1 = new CSE(s);
    IT o2 = new IT(s);
    ECE obj = new ECE(s);
    f.salary();
    o1.salary();
    o2.salary();
    obj.salary();
    //implement your required concept here
  }
}