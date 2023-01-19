import java.util.*;

/** The Calculator class provides 
methods to get addition and subtraction 
of given numbers*/

public class Calculator
{
	/**The add() method returns addition 
	of the given numbers*/
	
	public static int adds(int a,int b)
	{
		return a+b;
	}
	
	/** The sub() method returns subtraction
	of the given numbers*/
	
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String args[])
	{
		Calculator cal=new Calculator();
		System.out.print("The addition = "+ Calculator.adds(5,4)); //cal.add(5,4) WORKS
		//adds(5,4) Works
		System.out.print("\n   The subtraction ="+ Calculator.sub(5,4));
		// cal.sub(5,4) and sub(5,4) both works
	}
}