import java.util.*;
class AnsiConvert
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter sentence to convert : ");
		String str=ob.nextLine();
		int i,j=0;
		for(i=0;i<str.length();i++)
		{
			j=(int)str.charAt(i);
			System.out.print(j+",");
		}
	}
}
