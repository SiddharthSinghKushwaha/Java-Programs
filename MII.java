//program to show multiple inheritance using interface concept
import java.util.*;
interface Sem1
{
	float total=450.0f;
	void cal();
}
interface Sem2
{
	float total=500.0f;
	void cal();
}
class Avg implements Sem1,Sem2
{
	float t,avg;
	int tm1,tm2;
	Avg(int m1,int m2)
	{
		tm1=m1;
		tm2=m2;
	}
	public void cal()
	{
		t=Sem1.total + Sem2.total;
		avg=(tm1+tm2)/2;
	}
	void display()
	{
		System.out.println("Total marks="+t);
		System.out.println("total obtained marks="+ (tm1+tm2));
		System.out.println("average="+avg);
	}
}
class MII
{
	public static void main(String args[])
	{
		Avg a=new Avg(407,407);
		a.cal();
		a.display();
	}
}