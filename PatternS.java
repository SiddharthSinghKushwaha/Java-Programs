import java.util.*;
public class PatternS
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for n:");
        int n = sc.nextInt();
        pattern(n);
        
    }
     static void pattern(int n)
    {
        for(int r =1;r<=n;r++)
        {
            int space = n-r;
            for(int i =1;i<=space;i++)
            {
                System.out.print(" ");
            }
            for(int col = 1;col <= r; col++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}