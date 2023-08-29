class Bank
{
	Bank()
	{
		System.out.println("There are many banks");
	}
}
class SBI extends Bank
{
	SBI()
	{
		System.out.println("SBI is a bank");
	}
}
class ICICI extends Bank
{
	ICICI()
	{
		System.out.println("ICICI is bank");
	}
}
class D 
{
	public static void main(String[] args) 
	{
		ICICI i=new ICICI();
		SBI s=new SBI();
	}
}
