import java.util.*;
class Bitpuzzle
{
	public static void main(String args[])
	{
		int mask= 0x000F;
		int value= 0x2222;
		System.out.println(value & mask);
		int i=010;
		int j= 07;
		System.out.println(i);
		
		System.out.println(j);
		/*
		Scanner ob= new Scanner(System.in);
		int i=1;
		while(ob.hasNext())
		{
			System.out.println(i++ +" "+ ob.nextLine);
		}
		*/
		//to covert integer to string 3 way
		/*
		String s=Integer.toString(num);
		String s=String.valueOf(num);
		String s=""+num;*/
	}
	
}