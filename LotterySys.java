import java.util.*;
import java.math.*;

//Lottery system: using BigInteger
class LotterySys
{
	public static void main(String []arsg)
	{
		Scanner ob=new Scanner (System.in);
		System.out.println("How many number you want to draw: ");
		int k= ob.nextInt();
		
		System.out.print("What is the highest you can draw: ");
		int n=ob.nextInt();
		
		BigInteger lotteryOdd = BigInteger.valueOf(1);
		for(int i=1; i<=k; i++)
		{
			lotteryOdd= lotteryOdd.multiply(BigInteger.valueOf(n-i+1).
			divide(BigInteger.valueOf(i)));
		}
		
		System.out.println("Your odds in 1 in "+ lotteryOdd+ ". Good Luck!!");
	}
}