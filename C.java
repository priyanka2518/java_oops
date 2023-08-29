class bird
{
	bird()
	{
		System.out.println("There are many birds");
	}
}
class parrot extends bird
{
	parrot()
	{
		System.out.println("Parrot is a bird");
	}
}
class sparrow extends bird
{
	sparrow()
	{
		System.out.println("Sparrow is a bird");
	}
}
class C
{
	public static void main(String[] args) 
	{
		sparrow s=new sparrow();
		parrot p=new parrot();
	}
}
