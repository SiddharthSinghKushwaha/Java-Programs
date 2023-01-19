class CBR   //write CBR for call by reference
{
	int data=50;
	void change(CBR ob)  //CBR
	{
		ob.data=ob.data+100;
		System.out.println("Inside method(During change) "+ ob.data);
	}
	public static void main(String args[])
	{
		CBR ob=new CBR();  //CBR
		System.out.println("Before change "+ob.data);
		ob.change(ob);
		System.out.println("After change "+ ob.data);
	}
}