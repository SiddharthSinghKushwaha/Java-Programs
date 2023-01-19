import java.util.*;
class CountingSort
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter how many numbers ");
		int n = ob.nextInt();
		int key[]= new int[n];
		System.out.println("Enter numbers in range 1 to 5");
		for(int i=1; i<=n; i++)
			key[i-1]= ob.nextInt();
		
		int arr[]= new int[5];
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(key[j]== (i+1))
					arr[i]++;
			}
		}
		System.out.println("\nThe sorted elements using counting sort ");
		for(int i=0; i<5; i++)
		{
			int count= arr[i];
			while(count !=0)
			{
				System.out.print(i+1 + " ");
				count--;
			}
		}
	}
}