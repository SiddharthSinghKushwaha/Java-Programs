package pack;
//To complile tpye: javac -d . classname.java
public class Addition
{
	public static double add(double ... x)
	{
		double sum=0.0;
		for(int i=0;i<x.length;i++)
			sum+=x[i];
		return sum;
	}
	public static int add(int ... x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
			sum+=x[i];
		return sum;
	}
	public static String add(String ... s)
	{
		String s1="";
		for(int i=0;i<s.length;i++)
			s1+=s[i];
		return s1;
	}
		public static String add(char ... ch)
	{
		String s="" ;
		for(int i=0;i<ch.length;i++)
			s+=ch[i];
		return s;
	}
}