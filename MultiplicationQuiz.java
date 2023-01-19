/*
(Game: multiplication quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
Revise the program to randomly generate a multiplication question with two integers less than 1000.
*/

import java.util.Scanner;

public class MultiplicationQuiz {
	public static void main(String[] agrs) {
		Scanner ob = new Scanner(System.in);

		// Generate tow integers less than 1000
		int number1 = (int)(Math.random() * 1000);
		int number2 = (int)(Math.random() * 1000);

		// Prompt the user to enter an answer
		System.out.print("What is " + number1 + " * " + number2 + "? ");
		int answer = ob.nextInt();

		// Display result
		if (number1 * number2 == answer)
			System.out.println("You answer is correct!!");
		else
			System.out.println("You answer is wrong.\n The Correct answer is " + (number1 * number2));
	}
}