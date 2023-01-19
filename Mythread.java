import java.io.*;
class Mythread extends Thread
{
	boolean stop=false;
	public void run()
	{
		for(int a=0;a<10;a++)
			System.out.print(a+" ");
	}
}
class ThreadConcept
{
	public static void main(String ra[]) throws IOException
	{
		Mythread obj=new Mythread();
		Thread t=new Thread(obj);
		t.start();
		System.in.read();
		obj.stop=true;
	}
}