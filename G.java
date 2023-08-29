//Downcasting
class bike
{
	public void accelerate()
	{
		System.out.println("There are many bikes in market");
	}
}
class bullet extends bike
{
	public void size()
	{
		System.out.println("Bullet is a bike");
	}
}
class RoyalEnfield extends bullet
{
	public void engine()
	{
		System.out.println("Royal Enfield is a bullet");
	}
}
class G
{
	public static void main(String[] args) 
	{
		bike b=new RoyalEnfield();
		b.accelerate();
		System.out.println();

		bullet obj=(bullet)b;
		obj.size();
		obj.accelerate();
		System.out.println();

		RoyalEnfield r=(RoyalEnfield)obj;
		r.engine();
		r.size();
		r.accelerate();
	}
}
