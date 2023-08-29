class patient
{
   String pt_name;
   private String disease;
   int pt_no;

  //NS-method
   public void progress()
	{
	   System.out.println(this.pt_name+":is fine now");
	}

   //NS getter method
   public String get_disease()
	{
		return disease;
	}

	//NS setter method
	public void set_disease(String d)
	{
		this.disease=d;
	}

	public void p_details()
	{
		System.out.println(this.pt_name);
		System.out.println(this.disease);
		System.out.println(this.pt_no);
	}
	patient(String name,String disease,int no)
	{
		this.pt_name=name;
		this.disease=disease;
		this.pt_no=no;
	}
}
class Hospital
{
    static String hospital_name="life care";

	public static void main(String[] args) 
	{
		patient p=new patient("priya","headache",12);
		System.out.println(p.get_disease());

		p.set_disease("cancer");
		System.out.println(p.get_disease());
	}
}
