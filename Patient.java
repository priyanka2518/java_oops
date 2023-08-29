class Patient 
{
    String P_name;
	String P_id;
	long P_mobno;
Patient(String name,String id,long mobno)
	{
		P_name=name;
		P_id=id;
		P_mobno=mobno;
	}	
public void P_details()
	{
		System.out.println(P_name);
		System.out.println(P_id);
		System.out.println(P_mobno);
	}
public void appointment()
	{
	System.out.println(this.P_name+" has applied for appointment");
	}
}



