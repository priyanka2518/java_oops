//multiple inheritance
class frontend
{
  public void design()
	{
	  System.out.println("By using frontend we can design");
	}
}
interface backend
{
	static void store()
	{
		System.out.println("We can store database");
	}
}
class language extends frontend implements backend
{
	public static void store()
	{
		System.out.println("We can create database and design");
	}
}
class  multiple2
{
	public static void main(String[] args) 
	{
		language l=new language();
		l.store();
		l.design();

		backend.store();
        
		frontend f=l;
		f.design();
	}
}
