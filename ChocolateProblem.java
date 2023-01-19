import java.util.*;
import java.io.*;
class ChocolateProblem
{
	
	static	int findTotal(int a,int b)
		{

    if(b == 1)
       return a;
    if(a==b)
       return 1;
    int p = a-b;
    return 1+ findTotal(Math.max(p,b), Math.min(p,b));
}


public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		int d=ob.nextInt();
		int total =0;
    //two for loops to get all possible sizes of box .then count
		for(int i=a;i<=b;i++){
        for( int j=c;j<=d;j++){
          total+= findTotal(Math.max(i,j), Math.min(i,j));
        }

    }
    System.out.println(total);
	}
}