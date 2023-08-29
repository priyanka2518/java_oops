class Student 
{
	String st_name;
	String st_dob;
	private double st_fee;

	//NS-method
	public void study()
	{
		System.out.println(this.st_name+":good in java");
	}
	//NS-getter  method
	public double get_st_fee()
	{
		return st_fee;  //or this.st_fee
	}
	
	//NS setter method
	public void set_st_fee(double fee)
	{
		this.st_fee=fee;
	}

	public void st_details()
	{
		System.out.println(this.st_name);
		System.out.println(this.st_dob);
		System.out.println(this.st_fee);
	}

	Student(String name,String dob,double fee)
	{
		this.st_name=name;
		this.st_dob=dob;
		this.st_fee=fee;
	}
}
class school
{
	static String school_name="java-school";

	public static void main(String[] args) 
	{
		Student s1=new Student("priya","18/3/2001",20000);
	//	System.out.println(s1.st_fee);  variable is still private
		System.out.println(s1.get_st_fee());
       
	//  s1.st_fee=12000; variable is still private
	    s1.set_st_fee(12000);   //setter method
		System.out.println(s1.get_st_fee());  //getter method
	}
}
