//method overriding with the help of interface
interface hp
{
	void manufacturing();
}
class company implements hp
{
	public void manufacturing()
	{
		System.out.println("Hp is a company");
	}
}
class m_o
{
	public static void main(String[] args) 
	{
		company c=new company();
		c.manufacturing();

		hp h=c;
		h.manufacturing();
	}
}
