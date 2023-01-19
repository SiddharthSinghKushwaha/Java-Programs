public class Pattern4 {

public static void main(String[] args) {
pattern(4);

// TODO Auto-generated method stub

}
static void pattern(int n)
{
int original=n;
n=2*n;
for(int r=0;r<n;r++)
{
for(int c=0;c<n;c++)
{
int index=original-Math.min(Math.min(c, r),Math.min(n-c-1, n-r-1));
System.out.print(index + " " );
}
System.out.println();
}
}

}

/*

8. WAP to print all factors of a number using function named as 'factor'.
Input: Enter a number - 6
Factors are - 1, 2, 3, 6
9. WAP to find LCM and GCD of two numbers with [and without] in-built functions. 
Note: you have use two different function named as lcm & gcd.
First use in-built function to find and then write user defined function to find lcm and gcd.
10. WAP to print the following pattern programs (n = 5).
i)

    *
   * *
  * * *
 * * * *
* * * * *

ii)

* * * * *
 * * * *
  * * *
   * *
    *

*/