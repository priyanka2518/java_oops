/* //Hybrid inheritance
interface add
{
  void addition();
}
interface sub extends add
{
   void subtraction();
}
class mul implements add
{
  public void multi()
	{
	  System.out.println("multi() and add()");
	}
  void addition();

}
class calculation extends mul implements sub
{
  public int cal()
  {
     System.out.println("cal()");
  }
  void subtraction();
}
class hybrid1 
{
	public static void main(String[] args) 
	{
		calculation c=new calculation();
		c.cal();
		c.subtraction();
	}
}
 -->