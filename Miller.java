import java.util.*;
class Miller
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int a = 2;
		if(n % 2 != 0)
		{
		   int k = kvalue(n-1);
		   int m = (int)((n-1)/ Math.pow(2,k));
		   int T = (int)(Math.pow(a, m) % n);
		   if( T==1 ||T == n-1)
		   {
			System.out.println("It is a prime");
		   }
		   else
		    {
			for(int i =1; i < k; i++)
			{
			  T = (T*T) % n;
			  if(T == n-1)
			  {
				System.out.println("It is a primee");
			  }
			  if(T == 1 )
			  {
				System.out.println("It is a composite");
			  }
			}
		    }

		}
		else
		 System.out.println("It is a not prime");

	}
	static int q = 0;
        static int kvalue(int p)
	{
	  while(p>0)
	  {
		if(p % 2 == 0)
		{
		   q=q+1;
		   p=p/2;
		}
		else
		{
		  break;
		}
	  }
	  return q;
	}
	
}