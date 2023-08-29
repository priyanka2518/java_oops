class employee 
{
	String emp_name;
	private int emp_id;
	String job;

	//NS method
	public void progress()
	{
		System.out.println(this.emp_name+":is average");
	}

	//NS getter method
	public int get_emp_id()
	{
		return emp_id;
	}

	//NS setter method
	public void set_emp_id(int id)
	{
		this.emp_id=id;
	}

    public void details()
	{
		System.out.println(this.emp_name);
		System.out.println(this.emp_id);
		System.out.println(this.job);
    }
  
    employee(String name,int id,String job)
	{
		this.emp_name=name;
		this.emp_id=id;
		this.job=job;
	}
}
class company
{
	static String company_name="Infosys";
	public static void main(String[] args) 
	{
		employee e=new employee("priya",101,"manager");
		System.out.println(e.get_emp_id());

		e.set_emp_id(104);
		System.out.println(e.get_emp_id());
	}
}
