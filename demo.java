class A //extends object
{
	A()
	{
		//super();
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		//super(); writing not manadatory
		System.out.println("B()");
	}
}
class demo 
{
	public static void main(String[] args) 
	{
		B obj=new B();
	}
}
