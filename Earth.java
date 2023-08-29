class Earth extends whiteRose
{
	public static void main(String[] args) 
	{
		whiteRose wr=new whiteRose();
		wr.shape();
		wr.color();
		wr.smell();
		System.out.println();
	
	    rose r=wr;
		r.color();
		r.smell();
		System.out.println();

		flower f=r;
		//flower f=wr;  also
		f.smell();
		//f.color(); f.shape(); not possible
	}
}
