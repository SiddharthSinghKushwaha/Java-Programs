class Outer
{
	void outerMethod()
	{
		final int x=98;
		System.out.println("Inside outer method");
		class Inner
		{
			void innerMethod()
			{
				System.out.println("x= "+x);
			}
		}
		Inner y=new Inner();
		y.innerMethod();
	}
}
class LocalExample
{
	public static void main(String args[])
	{
		Outer x=new Outer();
		x.outerMethod();
		System.out.println("Hash code of: "+ x.hashCode());
	}
}