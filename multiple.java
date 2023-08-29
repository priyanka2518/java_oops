//multiple inheritance
interface eat
{
   void action();
}
class move 
{
	void  moving()
	{
		System.out.println("girls can perform action");
	}
}
class girl extends move implements eat
{
	public void action()
	{
		System.out.println("A girl can move and eat");
	}
}
class multiple
{
	public static void main(String[] args) 
	{
		girl g=new girl();
		g.action();

		move m=g;
		m.moving();

		eat e=g;
		e.action();
	}
}
