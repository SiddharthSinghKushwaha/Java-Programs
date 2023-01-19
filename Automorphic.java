import java.util.*;
public class Automorphic
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=ob.nextInt();
		int nsq=num*num;
		int d,n=0,p=1,execute=-1;
		while(nsq>0)
		{                             /*  if((n%10)==(sq%10)){n=n/10;sq=sq/10;}else break;  if(n/10==0) yes it automorphic else no*/
			
			d=nsq%10;
			n=(d*p)+n;
			if(n==num)
			{
				execute=1;
				break;
			}
			p=p*10;
			nsq=nsq/10;  
		}
		if(execute==1)
			System.out.print("\nThe number "+ num+" is AUTOMORPHIC");
		else
			System.out.print("Not automorphic");
	}
}