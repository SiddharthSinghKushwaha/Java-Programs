 import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int matrixA[][]=new int[2][2];
		int matrixB[][]=new int[2][2];
		int matrixM[][]=new int[2][2];
		System.out.print("Enter matrix A elements: \n");
		int r,c=0;
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				matrixA[r][c]=ob.nextInt();
			}
		}
		System.out.print("Enter matrix B elements:\n");
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				matrixB[r][c]=ob.nextInt();
			}
		}
		//code for matrix multiplication            A(m*n) B(n*p) c(m*p)
		for(r=0;r<2;r++) //for(i=0;i<m;i++)
		{
			for(c=0;c<2;c++)//for(j=0;j<n;j++)
			{
				matrixM[r][c]=0;//m[i][j]=0
				for(int a=0;a<2;a++)// for(k=0;k,n;k++)
				{
					matrixM[r][c]=matrixM[r][c]+ (matrixA[r][a]* matrixB[a][c]);
				}   //m[i][j]+= a[i][k]*a[k][j];
			}
		}
		//printing the matrix
		System.out.println("\nMatrix A\n");
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print(matrixA[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix B\n");
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print(matrixB[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("Resulant matrix\n");
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print(matrixM[r][c]+" ");
			}
			System.out.println();
		}
	}
}