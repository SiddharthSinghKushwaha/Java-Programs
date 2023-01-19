
class CBV
{
	int data=50;
	void change(int data)
	{
		data=data+100;
		System.out.println("Inside method(During change) "+ data);
	}
	public static void main(String args[])
	{
		CBV ob=new CBV();
		System.out.println("Before change "+ob.data);
		ob.change(100);
		System.out.println("After change "+ ob.data);
	}
}