import java.util.*;
class LCM
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter two number to find out LCM\n");
		int n=ob.nextInt();
		int m=ob.nextInt();
		int max,lcm=1;
		if(m>n)
			max=m;
		else
			max=n;
		for(int i=2;i<=max/2;i++)
		{
			if(n%i==0 && m%i==0)
			{
				n=n/2;
				m=m/2;
				lcm= lcm*i;
				i=1;
			}
		}
		System.out.println("The GCD of the input number is "+ lcm);
		System.out.println("The lCM of two input number is "+ (lcm*n*m));
	}
}