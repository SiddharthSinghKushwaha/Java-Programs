import java.util.*;
import java.lang.*;
class PasswordCheck
{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter password: ");
		String pw=ob.nextLine();
		int letter,digit,sc;
		System.out.print("Your Password "+ pw+" is ");
		if(pw.length()<5)
			System.out.print(" INVALID");
		else
		{
			letter=0;digit=0;sc=0;
			for(int i=0;i<pw.length();i++)
			{
				char ch=pw.charAt(i);
				if((ch>='a' && ch<='z')|| (ch>='A'&& ch<='Z'))
					letter++;
				else if((int)ch>47 && (int)ch<60)
					digit++;
				else
					sc++;
			}
			if(letter==0 || digit==0|| sc==0)
				System.out.print("INVALID");
			else
				System.out.print("VALID");
		}
		ob.close();
	}
}