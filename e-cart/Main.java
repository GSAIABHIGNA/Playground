//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int p)
  {
    this.price = p;
  }
  public int getPrice()
  {
    return this.price;
  }
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  public void setProduct(String s)
  {
    this.product = s;
  }
  public void setQuantity(int q)
  {
    this.quantity = q;
  }
  public String getProduct()
  {
    return this.product;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
  //create various method to return attribute value(s)
}

class Bill
{
  Item i = new Item();
  Customer c = new Customer();
  
  public long che(int p,int q)
  {
    long t = p * q;
    return t;
  }
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
   Item it = new Item();
    Customer cu = new Customer();
    Bill obj = new Bill();
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    cu.setProduct(s);
    int p = in.nextInt();
    it.setPrice(p);
    int q = in.nextInt();
    cu.setQuantity(q);
    System.out.println("Total Price is : "+obj.che(p,q));
    //write the logic here
  }
}