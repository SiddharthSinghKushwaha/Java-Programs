/*Generating random numbers in Java
Java provides three ways to generate random numbers using some built-in methods and classes as listed below:

java.util.Random class
Math.random method : Can Generate Random Numbers of double type.
ThreadLocalRandom class
1) java.util.Random
For using this class to generate random numbers, we have to first create an instance of this class 
and then invoke methods such as nextInt(), nextDouble(), nextLong() etc using that instance.
We can generate random numbers of types integers, float, double, long, booleans using this class.
We can pass arguments to the methods for placing an upper bound on the range of the numbers to be generated.
 For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive.*/

import java.util.*;
import java.util.Random;
public class GameRPS
{
	public static void main(String args[])
	{
		Random rand=new Random();
		Scanner ob=new Scanner(System.in);
		int comp,u,c;
		System.out.println();
		System.out.println("*******------ PLAY ROCK-PAPER-SCISSOR WITH COMPUTER-------********");
		System.out.print("Enter the player name: ");
		String name=ob.nextLine();
		System.out.print("How many chances you need to beat Computer- ");
		int not=ob.nextInt();
		System.out.println("\nLet Begins\n ");
		System.out.println("REMEBER Enter\n 1 for ROCK\n 2 for PAPER\n 3 for SCISSOR\n");
		System.out.println("\t    "+ name +" Vs  Computer");
		u=0;c=0;
		for(int i=0;i<not;i++)   //not for number of time
		{
			System.out.print("\nYour choice: ");
			int uc=ob.nextInt();
			comp=rand.nextInt(2)+1;
				
			if(uc==comp)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("---------NO RESULT---------");
			}
			else if(uc==1 && comp==3)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("Your Rock breaks computer Scissor");
				System.out.println("---------YOU WIN------------");
				u++;
			}
			else if(uc==2 && comp==1)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("Your Paper covers Computer Rock");
				System.out.println("---------YOU WIN------------");
				u++;
			}
			else if(uc==3 && comp==2)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("Your Scissor cuts computer Paper");
				System.out.println("---------YOU WIN------------");
				u++;
			}
			else if(uc==1 && comp==2)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("Your Rock can't defeat computer paper");
				System.out.println("---------COMPUTER WIN------------");
				c++;
			}
			else if(uc==2 && comp==3)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("Your Paper can't defeat computer Scissor");
				System.out.println("---------COMPUTER WIN------------");
				c++;
			}
			else if(uc==3 && comp==1)
			{
				System.out.println("\t\t"+ uc + "\t "+ comp);
				System.out.println("Your Scissor can't defeat computer Rock");
				System.out.println("---------COMPUTER WIN------------");
				c++;
			}
			else
				System.out.println("Invalid choice by YOU, Try Again");
		}
		System.out.println("\n Final score\t"+name+"("+u+")\tComputer("+c+")");
		if(u>c)
			System.out.println("*------------Congo, YOU win------------------*");
		else if(u==c)
			System.out.println("-------------Match Drawn----------------");
		else
			System.out.println("*-----------Computer Wins--------------*");
	}
}