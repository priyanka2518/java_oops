class parent
{
	parent()
	{
	  System.out.println("Family()");
	}
}
class child extends parent
{
   child()
	{
	   System.out.println("child()");
	}
}
class family
{
	public static void main(String[] args) 
	{
		child c=new child();
		
	}
}
