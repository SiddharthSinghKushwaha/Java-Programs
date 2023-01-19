class SmartPhone
{
	String companyName;
	double screenSize;
	SmartPhone()
	{
		companyName="Nokia";
		screenSize=4.5;
	}
	void display()
	{
		class Camera
		{
			int frontCam, rearCam;
			Camera()
			{
				frontCam=5;
				rearCam=12;
			}
			void showTime()
			{
				System.out.println("** Details of SmartPhone **");
				System.out.println("Company Name:\t\t"+ companyName);
				System.out.println("Screen Size:\t\t"+ screenSize+"inches");
				System.out.println("Front Camera:\t\t"+ frontCam+"MP");
				System.out.println("Rear Camera:\t\t"+ rearCam+"MP");
			}
		}
		Camera c= new Camera();
		c.showTime();
	}
}
public class MobileShowRoom
{
	public static void main(String args[])
	{
		SmartPhone s=new SmartPhone();
		s.display();
	}
}