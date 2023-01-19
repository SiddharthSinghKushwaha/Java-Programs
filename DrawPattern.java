import java.util.*;
class DrawPattern
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=ob.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{
				for(j=i;j<=n;j++)
					System.out.print(j+ " ");
				System.out.println();
			}
			else
			{
				for(j=i;j<=n;j++)
				{
					if(i==j|| j==n)
						System.out.print(j+" ");
					else
						System.out.print(" "+ " ");
				}
				System.out.println();
			}
		}
	}
}