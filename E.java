//upcasting
class birds
{
  public void fly()
  {
	  System.out.println("All birds can fly");
  }
}
class parrot extends birds
{
	public void color()
	{
		System.out.println("Parrot has green color");
	}
}
class parakeet extends parrot
{
	public void tricks()
	{
		System.out.println("They have some tricks");
	}
}
class E
{
	public static void main(String[] args) 
	{
		parakeet p=new parakeet();
		p.tricks();
		p.color();
		System.out.println();

		parrot obj=p;
		obj.color();
		obj.fly();
		System.out.println();

		birds b=p;
		b.fly();
	}
}
