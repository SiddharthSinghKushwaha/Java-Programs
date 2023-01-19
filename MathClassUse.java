/*
Write a Java application that uses the Math class to determine the answers for each of the following:
a. The square root of 37
b. The sine and cosine of 300
c. The value of the floor, ceiling, and round of 22.8
d. The larger and the smaller of the character ‘D’ and the integer 71
e. A random number between 0 and 20 (Hint: The random() method returns a value between 0 and 1; you want a number that is 20 times larger.
*/

import java.util.Random;

public class MathClassUse {
	public static void main(String[] args) {

	int x = 37;	// to find square root of 37, first store in x
	int y = 300;	// to find sine and cisine value of 300, first store in y
	double z = 22.8;
	
	//a. The square root of 37
	System.out.println ("\nThe Square root of 37 is " + Math.sqrt(x));
	
	//b. The sine and cosine of 300
	System.out.println ("\nThe Sine of 300 is " + Math.sin(y) + "\nThe cosine is " + Math.cos(y));
	
	//c. The value of the floor, ceiling, and round of 22.8
	System.out.println ("\nThe Floor of 22.8 is " + Math.floor(z));
	System.out.println ("The Ceiling of 22.8 is " + Math.ceil(z));
	System.out.println ("The Round Value of 22.8 is " + Math.round(z));
	
	//d. The larger and the smaller of the character ‘D’ and the integer 71
	System.out.println("\nThe larger of the character D is "+ (char)(Math.incrementExact('D')));
	System.out.println("The smaller of the character D is "+ (char)(Math.decrementExact('D')));
	System.out.println("The larger of the 71 is "+ Math.incrementExact(71));	//Parameter 71 incremented by 1.
	System.out.println("The smaller of the 71 is "+ Math.decrementExact(71));	//Parameter 71 is decremented by 1.
	
	
	//e. A random number between 0 and 20
	Random r = new Random();
	int value = r.nextInt(20);
	System. out. println ("\nA random Number between 0 and 20 is " + value);
	
	
	}
}