class Laptop
{
	static String companyName;
	static int memory;
	String mouse;
	Laptop()
	{
		companyName="DELL";
		memory=2048;
		mouse="Wired";
	}
	class CPU
	{
		String name;
		float clkrate;
		CPU()
		{
			name="Intel core i3";
			clkrate=2.78f;
		}
		void showConfig()
		{
			System.out.println("Brand name:\t\t"+ companyName);
			System.out.println("Memory Size:\t\t"+ memory);
			System.out.println("Mouse type:\t\t"+ mouse);
			System.out.println("CPU name:\t\t"+ name);
			System.out.println("CPU clockrate:\t\t"+ clkrate + "GHz");
		}
	}
	void display()
	{
		CPU c=new CPU();
		c.showConfig();
	}
}
public class CompShowRoom
{
	public static void main(String[] args)
	{
		Laptop lp=new Laptop();
		System.out.println("**configuration of laptop**");
		lp.display();
	}
}