abstract class Animal
{
  Animal()
	{
	  System.out.println("Non static constructor");
	}
}
class planet
{
	public static void main(String[] args) 
	{
		Animal obj=new Animal();
	}
}
