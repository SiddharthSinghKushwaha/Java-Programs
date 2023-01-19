import java.util.*;
class Allduplicatecyclic
{
  public static void main(String[] args)
  {
    int arr[]={4,3,2,7,8,2,3,1};
    System.out.println(Arrays.toString(duplicate(arr)));
  }
  static int[] duplicate(int arr[])   
  {
    int i=0;
    while(i<arr.length)
    {   
        int correct = arr[i]-1;
  	if(arr[i]!=arr[correct])
 	{
	  int temp=arr[i];
	  arr[i]=arr[correct];
	  arr[correct]=temp;
    	}
 	else
	i++;
     }
      int A[]=new int[arr.length];   
      int count=0;
    for(int j=0; j<arr.length;j++)
    {
	int correct1=arr[j]-1;
	if(arr[j]!=j+1 && arr[j]== arr[correct1])
        {
	  A[count]=arr[j];
	  count++;
 	}
     }
    return A;
 }
}