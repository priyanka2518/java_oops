//method overriding
class bird
{
	public String fly()
	{
		return "bird can fly";
	}
}
class sparrow extends bird
{
	public String fly()
	{
		return "sparrow can fly";
	}
}
class J
{
	public static void main(String[] args) 
	{
		sparrow s=new sparrow();
		System.out.println(s.fly());

		bird b=s;
		System.out.println(b.fly());
	}
}
