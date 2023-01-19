import java.util.*;
class ExampleArea
{
	void area(int s)
	{
		System.out.println("square = "+ s*s);
	}
}
class Area extends ExampleArea
{
	void area(int l,int b)
	{
		System.out.println("Area of rectangle= "+ l*b);
	}
}
public class CallFunction
{
	public static void main(String args[])
	{
		Area ar=new Area();
		ar.area(3);
		ar.area(6,4);
	}
}