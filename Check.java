import java.util.*;
import java.io.*;
class Check
{
	public static void main(String args[])
	{
		System.out.println('a' + 'b');
		System.out.println(5 + "sid");
		/*
			int arr[2]; It show error.
			int arr[]; It shown't error. But accessing arr[0] gives error;
		*/
		/* here **** */
		/* ent /* hi*/ //(*/) //this is error
		/* hfjifn // morr */
		// /*nfjn // // */
		try{
			Float f1=new Float("3.0");
			int x=f1.intValue();
			byte b=f1.byteValue();
			double d=f1.doubleValue();
			System.out.println(x+b+d);
			
		}
		catch (NumberFormatException e)
		{
			System.out.println("bad number");
		}
		
		int arr[]=new int[2];
		System.out.println(" Your output ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(Math.floor(-7.8));
	}
}