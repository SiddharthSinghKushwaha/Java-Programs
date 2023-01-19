import java.util.*;
class InsertionSort
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int A[]={99,94,87,74,65,58,42,36,23,11};
		int key,j,count=0;
		
		for(int i=1;i<10;i++)
		{
			key=A[i];
		    j=i-1;
			while(j>-1 && A[j]<key)
			{
				count++;
			    A[j+1]=A[j];
				j--;
			}	
			A[j+1]=key;
		}
		System.out.print("\n The number of comparision is: "+ count);
		System.out.print("\nTHE sorted array= ");
		for(j=0;j<10;j++)
		{
			System.out.print(" "+A[j]);
		}
	}
	
}