interface Sem1
{
	float total=450.0f;
	void marks1();
}
interface Sem2
{
	float total=500.0f;
	void marks2();
}
class Avg implements Sem1,Sem2
{
	float per1,per2,m1,m2;
	Avg(float mrk,float mk)
	{
		m1=mrk;
		m2=mk;
	}
	public void marks1()
	{
		per1=(m1/Sem1.total)*100;
		System.out.println("Percentage of sem= "+ per1);
	}
	public void marks2()
	{
		per2=(m2/Sem2.total)*100;
		System.out.println("Percentage of sem2= "+ per2);
	}
}
public class DemoInterface
{
	public static void main(String args[])
	{
		Avg a=new Avg(406.0f,480.0f);
		a.marks1();
		a.marks2();
		
	}
}