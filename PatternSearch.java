import java.util.*;
class PatternSearch
{
	static void search(String pat,String txt)
	{
		for(int i=0;i<=txt.length()-pat.length();i++)
		{
			String substr=txt.substring(i,i+pat.length());
			if(substr.compareTo(pat)==0)
			{
				System.out.println("The pattern is found at index "+ i);
				i+=pat.length()-1;
			}
		}
	}
	public static void main(String args[])
	{
		search("abc","ababcabababc");
	}
}