class A 
{
	A()
	{
		this(10);
		System.out.println("A()");
	}
	A(int b)
	{
		System.out.println("A(int)");
	}
	public static void main(String[] args) 
	{
		A obj=new A();
	}
}
