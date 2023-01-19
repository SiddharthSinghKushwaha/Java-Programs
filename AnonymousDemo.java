abstract class Shape
{
	abstract void area(double ...a);
}
public class AnonymousDemo
{
	public static void main(String[] args)
	{
		Shape square=new Shape(){
			void area(double ...a)
			{
				System.out.println("Area of square"+ a[0]*a[0]);
			}
		};
		square.area(10.0);
		Shape rect=new Shape(){
			void area(double ...a)
			{
				System.out.println("Area of rectangle"+ a[0]*a[1]);
			}
		};
		rect.area(10,20);
	}
}