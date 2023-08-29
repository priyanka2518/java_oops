class grandfather
{
	grandfather()
	{
		System.out.println("Head of family");
	}
}
class father extends grandfather
{
	father()
	{
		System.out.println("father can access the properties of grandfather");
	}
}
class child extends father
{
	child()
	{
		System.out.println("child can access the properties of father");
	}
}
class family2 
{
	public static void main(String[] args) 
	{
		child ch=new child();
	}
}
