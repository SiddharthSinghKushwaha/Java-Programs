import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{                                               //bubbleSort written in java language
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter size of the arary:");
		int n=ob.nextInt();
		int arr[]=new int[n];  //dynamic_array used
		System.out.print("\nEnter elements of array\n");     //any integer value u can give
		for(int i=0;i<n;i++)
			arr[i]=ob.nextInt();
		System.out.println("Sorted ARRAy \n");
		for(int i=0;i<n-2;i++)           //in c or java, array begin with 0
		{
			int count=0;     //inplace of exchange, i have used count
			for(int j=0;j<(n-1-i);j++)
			{
			    if(arr[j]>arr[j+1])            //if condition true, swapping is done
				{
					int temp=0;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0)
			{
				for(int p=0;p<n;p++)
					System.out.print(arr[p]+" ");
				break;
			}
		}
		ob.close();
	}
}