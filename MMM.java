import java.util.*;
class MMM
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter number of elments: ");
		int n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements: ");
		int i=0;
		double sum=0.0;
		for(i=0;i<n;i++)
		{
			arr[i]=ob.nextInt();
			sum=sum+ arr[i];
		}
		System.out.println("The mean of the set of number: "+ sum/n);
		System.out.println();
		for(i=0;i<n-2;i++)
		{
			int count=0;     
			for(int j=0;j<(n-1-i);j++)
			{
			    if(arr[j]>arr[j+1])
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
		if(n%2==0)
		{
			double med= (arr[n/2-1] + arr[(n/2)])/2.0;
			System.out.println("The medain of the given set is: "+ med);
		}
		else
		{
		System.out.println("The medain of the given set is: "+ arr[(n+1)/2]);
		}
		ob.close();
	}
}