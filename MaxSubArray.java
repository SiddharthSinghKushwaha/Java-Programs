import java.util.*;
class MaxSubArray
{
	public static void main(String ars[])
	{
		int arr[]={1,2,3,7,5};
		SumSubArray s=new SumSubArray();
		s.subArray(arr,arr.length,12);
	}
}
class SumSubArray
{
	void subArray(int arr[],int n,int s)
	{
		int flg=0,j=0,i=0;
		int sum=0;
		while(i<=n)
		{
			if(sum<s)
				sum+=arr[i++];
			else if(sum>s)
				sum-=arr[j++];
			if(sum==s)
			{
				flg=1;
				break;
			}
		}
		if(flg==1)
			System.out.println("Start pos: "+ (j+1) + " End pos: "+ i);
		else
			System.out.println("-1");
	}
}