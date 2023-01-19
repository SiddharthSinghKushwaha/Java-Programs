import java.util.*;
class PatternProgram1
{
	public static void main(String args[])
	{
		/*
			1
			3*2
			4*5*6
			10*9*8*7*6
			11*12*13*14*15
		*/
		int count = 0, prev = 0;
		int n = 5;
		for(int i=1; i<= n; i++)		//outer loop will excute 5 times
		{
			prev = count;
			count += i;
			if(i % 2 != 0 )
			{				//for odd row number
				int end = count;
				
				for( int j = prev + 1; j <= end ; j++)
				{
					if(j == end)
						System.out.print(j + "\n");
					else
						System.out.print(j + "*");
				}
			}
			else
			{
				int note = 0; // note- number of time executed
				for(int j = count;  note < i ; j--)
				{
					note++;
					if( note == i)
						System.out.print(j + "\n");
					else
						System.out.print(j + "*");
				}
			}
		}
	}
}