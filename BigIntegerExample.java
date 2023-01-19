import java.util.*;
import java.math.*;
class MultiOperaOfBigInteger
{
	static BigInteger multiply(BigInteger x, BigInteger y)
	{
		BigInteger multi=x.multiply(y);
		return multi;  //x.mod(y);
	}
}
public class BigIntegerExample
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0)
		{
			BigInteger x=ob.nextBigInteger();
			BigInteger y=ob.nextBigInteger();
			MultiOperaOfBigInteger b=new MultiOperaOfBigInteger();
			System.out.println(b.multiply(x,y));
		}
	}
}
//BigInteger prime number
/*
BigInteger n=ob.nextBigInteger();
    System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
*/