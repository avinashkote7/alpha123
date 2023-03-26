 class maharashtra
{
  public void mum()
  {
      System.out.println("i am maharashtra");
  }
}
      
class mumbai extends maharashtra
{
  
  public void mum()
  {
  System.out.println("Mumbai ");
  }

}
class driver
{
  public static void main(String[]args) 
  {
      maharashtra obj =new mumbai(); //upcasting
      System.out.println("Capital of Maharashtra is :");
      obj.mum(); //constructor overraiding
      
}
  
}
