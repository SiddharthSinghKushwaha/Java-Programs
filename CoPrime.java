//co-prime numbers: A number is said to be co-prime if the only positive integeer that divides both of them is 1.
class CoPrime
{
	static void coprime(int p, int q)
		{
			int count=0,i;
			for(i=1;i<=q/2;i++)
			{
				if(p%i==0 && q%i==0)
					count++;
			}
			if(count==1)
			{
				System.out.println(p+" "+q);
			}
		}
	public static void main(String args[])
	{
		System.out.println("Co prmine numbers between 10 and 20");
		for(int i=10;i<20;i++)
		{
			for(int j=i;j<20;j++)
			{
				coprime(i,j);
			}
		}
	}
}