//Downcasting
class Fruits
{
	public void test()
	{
		System.out.println("All fruit has different test");
	}
}
class mango extends Fruits
{
	public void smell()
	{
		System.out.println("Mango has a different smell");
	}
}
class kesar extends mango 
{
	public void shape()
	{
		System.out.println("Kesar mango has shape");
	}
}
class H
{
	public static void main(String[] args) 
	{
		Fruits f=new kesar();
		f.test();
		System.out.println();

		mango m=(mango)f;
		m.smell();
		m.test();
		System.out.println();

		kesar k=(kesar)m;
		k.smell();
		k.test();
		k.shape();
	}
}
