import java.util.*;
class Sorting
{
	void merge(int arr[],int l,int m,int r)
	{
		int i=l,j=m+1,k=0;
		int temp[]=new int[r-l+1];
		while(i<=m && j<=r)
		{
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<m)
			temp[k++]=arr[i++];
		while(j<=r)
			temp[k++]=arr[j++];
		
		for(int x=0,y=l;x<temp.length;x++,y++)
			arr[y]=temp[x];
	}
}
public class MergeSort
{
	static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void mergeSort(int arr[],int l,int r)
	{
		Sorting s=new Sorting();
		if(l<r)
		{
			int m=(l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			s.merge(arr,l,m,r);
		}
	}
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=ob.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=ob.nextInt();
		mergeSort(arr,0,n-1);
		printArray(arr);
	}
}