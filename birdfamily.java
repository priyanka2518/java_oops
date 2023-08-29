class Birds
{
	Birds()
	{
		System.out.println("There are many birds");
	}
}
class parrot extends Birds
{
	parrot()
	{
		System.out.println("Parrot is favorite bird");
	}
}
class parakeet extends parrot
{
	parakeet()
	{
		System.out.println("it talks and perform some tricks");
	}
}
class birdfamily
{
	public static void main(String[] args) 
	{
		parakeet pk=new parakeet();
	}
}
