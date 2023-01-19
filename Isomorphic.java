import java.util.*;
import java.io.*;
class Isomorphic 
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String s1=ob.next();
		System.out.println("Enter 2nd string: ");
		String s2=ob.next();
		//To check if Isomorphic or not if s1 character maps to s2 character
		//Example: s1= aaab s2=xxxy
		
		if(s1.length()!=s2.length())
			System.out.println("Not Isomorphic");
		else
		{
			int count1[]=new int[256];
			int count2[]=new int[256];
			for(int i=0;i<s1.length();i++)
			{
				if(count1[s1.charAt[i]]!= count2[s2.charAt[i]])
				{
					System.out.println("Not Isomorphic");
					break;
				}
				else
				{
					count1[s1.charAt[i]]++;
					count2[s2.charAt[i]]++;
				}
			}
		}
		ob.close();
	}
}