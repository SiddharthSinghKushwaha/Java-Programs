//is empty .java file name is valid source file name or not.
import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter the order of matrix ");
		int n=ob.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int add[][]=new int[n][n];
		int i,j;
		System.out.println("Enter the elemets of array a:\n");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=ob.nextInt();
		System.out.println("Enter the elemets of array b:\n");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j]=ob.nextInt();
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				add[i][j]=a[i][j]+ b[i][j];
			
		System.out.println("\nThe resulant matrix is \n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(add[i][j]+ "	");
			System.out.println();
		}
	}
}