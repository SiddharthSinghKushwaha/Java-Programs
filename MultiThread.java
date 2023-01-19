class MyThread implements Runnable
{
	static int x=0;
	public void run()
	{
		while(x<100)
			System.out.println("\t\t\t"+ Thread.currentThread().getName()+":"+(x++));
	}
}
public class MultiThread
{
	public static void main(String args[])
	{
		System.out.println("Begin Main thread...");
		MyThread obj1 =new MyThread();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj1);
		
		
		t1.start();
		t2.start();
		int y=200;
		while(y<251)
			System.out.println(Thread.currentThread().getName()+":"+(y++));
	}
}