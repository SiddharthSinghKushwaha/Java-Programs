import java.util.*;
class LetterCount
{
	public static void main(String[] args)
	{
		String s=args[0];
		String str="";
		for(int z=0;z<s.length();z++)
		{
			if(str.indexOf(s.charAt(z))== -1)
				str=str+ s.charAt(z);
		}
		System.out.println("String= "+ str);
		System.out.println("Frequency of Letter ");
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			char ch=str.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
					count++;
			}
			System.out.println(ch+" : "+ count);
		}
	}
}
