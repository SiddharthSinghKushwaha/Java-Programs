import java.util.*;
import java.util.Arrays;
class MonkeyDance
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int t= ob.nextInt();
		while(t-- >0)
		{
			int n=ob.nextInt();
			int arr[]= new int[n];
			int temp[]= new int[n];
			for(int i=0; i<n; i++){
			arr[i]= ob.nextInt();
			temp[i]= arr[i];}
			
			int count=0;
			while(t>0)
			{
				count++;
				for(int j=0; j<n; j++)
				{
					int chk= arr[arr[j]-1];
					arr[arr[j]-1]= arr[j];
					arr[j]= chk;
				}
				if(Arrays.equals(arr, temp)==true)
				{
					System.out.println(count);
					break;
				}
			}
		}
		
		
		
	}
}