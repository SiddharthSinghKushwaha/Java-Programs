/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question
with two integers less than 100.
*/
import java.util.Scanner;

public class AdditionQuiz {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);

		// Generate tow integers less than 1000
		int number1 = (int)(Math.random() * 1000);
		int number2 = (int)(Math.random() * 1000);

		// Prompt the user to enter an answer
		System.out.print("What is " + number1 + " * " + number2 + "? ");
		int answer = input.nextInt();

		// Display result
		if (number1 * number2 == answer)
			System.out.println("You are correct!");
		else
			System.out.println("You are wrong " + number1 + " + " + number2
				+ " should be " + (number1 * number2));
	}
}

/*
(Game: multiplication quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
Revise the program to randomly generate a multiplication question with two integers less than 1000.
*/