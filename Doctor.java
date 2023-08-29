class Doctor
{

	static String Doctor_name="chaitanya";

	public static void main(String[] args) 
	{
		Patient p1=new Patient("vaishnavi","A24",1234567809);
		Patient p2=new Patient("rutuja","B29",1234569809);

		p1.P_details();
		p1.appointment();

		p2.P_details();
		p2.appointment();
	
	}
}
