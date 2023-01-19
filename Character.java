import java.util.*;
class Character
{
	public static void main(String args[])
	{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch=ob.next().charAt(0);
	System.out.print("My input character is "+ ch);
	}
}