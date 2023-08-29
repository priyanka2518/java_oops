//upcasting
class company
{
	public void All()
	{
		System.out.println("There are many companys");
	}
}
class MNC extends company
{
	public void group()
	{
		System.out.println("There are group of MNC companys");
	}
}
class Infosys extends MNC
{
	public void branches()
	{
		System.out.println("There are many branches of infosys");
	}
}
class F
{
	public static void main(String[] args) 
	{
		Infosys i=new Infosys();
		i.branches();
		i.group();
		i.All();
		System.out.println();

		MNC m=i;
		m.group();
		m.All();
		System.out.println();

		company c=m;
		c.All();
	}
}
