/*
Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
Take the set of integers
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.
*/


import java.util.*;
import java.io.*;
import java.lang.*;

class LuckyNumber
{
	public static void main(String args[])
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
			int n= Integer.parseInt(read.readLine());
			System.out.println((new Solution().isLucky(n))? "1" : "0");
			new Solution().counter=2;
		}
	}
}  //19 is lucky number.. also check 13
class Solution
{
	 static int counter = 2;
    
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        if(counter > n)
            return true;
        if(n%counter==0)
			return false;
        int np=n;
            // System.out.println(np);
        np=np-np/counter;
        counter++;
        return isLucky(np);
    }
}