import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		String s="HAPPY";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		String s2="HAPPY";
		for(int i=s2.length()-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s2.charAt(j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		String s1="BIRTHDAY";
		for(int i=s1.length()-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1.charAt(j)+" ");
			}
			System.out.println();
		}
		String s4="BIRTHDAY";
		for(int i=0;i<s4.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s4.charAt(j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		String s5="PRAKASH";
		int count=0;
		for(int i=0;i<s5.length();i++)
		{
			for(int j=0;j<s5.length();j++)
			{
				if(count%2==0)
				{
					if(j%2==0)
						System.out.print(s5.charAt(j)+" ");
					else
						System.out.print(" ");
				}
				else
				{
					if(j%2!=0)
						System.out.print(s5.charAt(j)+" ");
					else
						System.out.print(" ");
				}
			}
			count++;
			System.out.println();
		}
		System.out.print("\n PRAKASH");
	}
}