import java.util.*;
class Gpattern{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the odd size of G: ");
		int n = ob.nextInt();
		int i,j,mid;
		for(i=0;i<n;i++)
		{
			mid=n/2+1;
			for(j=0;j<=mid;j++)
			{
				if(i==0 || i==n-1)
				{
					if(j==0 || j==mid)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else if(i==mid-1)
				{
					if(j==1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else
				{
					if(i<mid-1 && j==0)
						System.out.print("*");
					else if(i>mid-1 && (j==0||j==mid))
						System.out.print("*");
					else
						System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}