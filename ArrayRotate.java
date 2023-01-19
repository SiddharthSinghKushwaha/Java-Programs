import java.util.*;
class ArrayRotate
{
	static void rotateMatrix(int mat[][],int N)
	{
		for(int i=0;i<N/2;i++)
		{
			for(int j=i;j<N-1-i;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][N-1-i];
				mat[j][N-i-1]=mat[N-1-i][N-1-j];
				mat[N-1-i][N-1-j]=mat[N-1-j][i];
				mat[N-1-j][i]=temp;
			}
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
	static void transpose(int a[][],int n)
	{
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				b[i][j]=a[j][i];
		
		System.out.println("Transpose matrix \n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		//int arr[][]=new int[4][4];
		//for(int i=0;i<4;i++)
			//for(int j=0;j<4;j++)
				//arr[i][j]=ob.nextInt();
		//rotateMatrix(arr,4);
		int arr1[][]={{1,2,3,4},{31,32,33,34},{21,22,23,24},{11,12,13,14}};
		transpose(arr1,4);
		Search s=new Search();
		int arr2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
		s.searchElement(arr2,13,4);
	}
}
class Search
{
	//Array must be sorted to to do the searching operation
	void searchElement(int array[][],int x,int n)
	{
		int i=0,j=n-1;
		System.out.println("I am here in search class");
		while(i<n && j>=0)
		{
			if(array[i][j]==x)
			{
				System.out.println("The element is present at: "+ i+" "+j);
				break;
			}
			else if(array[i][j]>x)
				j--;
			else
				i++;
		}
	}
}