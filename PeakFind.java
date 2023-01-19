import java.util.*;
class TofindPeak
{
	int peakElement(int arr[],int n)
	{
		if(arr[0]>arr[1])
			return arr[0];
		if(arr[n-1]>arr[n-2])
			return arr[n-1];
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
				return arr[mid];
			else if(arr[mid+1]>=arr[mid])
				low=mid+1;
			else if(arr[mid-1]>=arr[mid])
				high=mid-1;
		}
		return -1;
	}
}
public class PeakFind
{
	public static void main(String args[])
	{
		int array[]={10,20,5,3,45,54,34};
		TofindPeak f=new TofindPeak();
		int ele=f.peakElement(array,7);
		if(ele==-1)
			System.out.println("Element not find");
		else
			System.out.println("The peak element is "+ ele);
	}
}