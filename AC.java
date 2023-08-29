class Bank
{
	public void transaction()
	{
      System.out.println("Bank");
	}
}
class SBI extends Bank
{
	public void city()
	{
		System.out.println("Specific city");
	}
}
class AC 
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
        s.city();
		s.transaction();
	}
}
