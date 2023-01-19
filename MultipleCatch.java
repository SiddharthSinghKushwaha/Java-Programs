
class MultipleCatch
{
	public static void main(String args[])
	{
		System.out.print("Length of String array "+args.length);
		
		int div=0;
		try
		{
			int m=Integer.parseInt(args[0]);
			int n=Integer.parseInt(args[1]);
			div=m/n;
			System.out.println("\nResult:"+ div);
		}		
		catch(ArithmeticException ex)
		{
			System.out.println("\nError:"+ ex.getMessage());
			System.out.println("Divisor must be non-zero value");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("\nError:"+ ex.getMessage());
			System.out.println("Divisor must be integer value only");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\nError:"+ ex.getMessage());
			System.out.println("Divisor must be two value");
		}
		finally
		{
			System.out.println("Program terminated ");
		}
	}
}