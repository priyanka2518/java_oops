//method overriding
class Flower
{
	public String smell()
	{
	  return "smell";
	}
}
class rose extends Flower
{
	public String smell()
	{
		return "excellent";
	}
}
class  I
{
	public static void main(String[] args) 
	{
		rose r=new rose();
		System.out.println(r.smell());

		Flower f=r;
		System.out.println(f.smell());

	}
}
