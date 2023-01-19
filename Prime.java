import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Find prime number between 1 to ");
		int n=sc.nextInt();
		int i,j,isPrime;
		System.out.println("Prime numbers between 1 to "+ n+ " are ");
		for(i=2;i<=n;i++)
		{
			isPrime=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=0;
					break;
				}
			}
			if(isPrime==1)
				System.out.println(i);
		}
		sc.close();
	}
}