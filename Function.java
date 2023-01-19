import java.util.*;
class FactorialR
{
    static int fact(int num)
    {
          if(num==0)
                return 1;
          else 
                return num*fact(num-1);     
    }
}
class Function 
{
      public static void main(String args[])
      {
       Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number- ");
       int n=ob.nextInt();
       System.out.println("The factorial of  "+ n+"  is "+ FactorialR.fact(n));
     }
}