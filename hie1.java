//hierarchical inheritance using class and interface

interface pen
{
	void write();
}
class fountain implements pen
{
  public void write()
	{
		System.out.println("pen is used to write");
	}
}
class gel implements pen
{
  public void write()
	{
        System.out.println("gel()");
	}
}
class hie1 
{
	public static void main(String[] args) 
	{
		gel g=new gel();
		g.write();

		fountain f=new fountain();
		f.write();
	}
}
