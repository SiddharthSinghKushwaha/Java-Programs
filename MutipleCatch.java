
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
		catch(Exception ex)
		{
			System.out.println("Error:"+ ex.getMessage());
			System.out.println("Divisor must be non-zero value");
		}
		finally
		{
			ob.close();
			System.out.println("Program terminated ");
		}
	}
}