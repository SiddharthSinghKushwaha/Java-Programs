 import java.util.*;
 class Called
 {
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter an integer number- ");
		int num=ob.nextInt();
		Reuse r=new Reuse();
		System.out.print("Factorial of number "+num +" is "+r.fact(num));
		System.out.println();
		System.out.print("\nEnter number to check for palindrome: ");
		int pnum=ob.nextInt();
		int d,rev=0;
		int org=pnum;
		while(pnum!=0)
		{
			d=pnum%10;
			rev=(rev*10)+d;
			pnum=pnum/10;
		}
		if(rev==org)
			System.out.print("\nEnter number is PALINDOME\n");
		else
			System.out.print("\nEnter number is NOT palindrome\n");
	}
 }
 class Reuse
 {
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
 }