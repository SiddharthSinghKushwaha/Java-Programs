import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

  public static void main(String[] args) {
    Random Random_number= new Random();
    int right_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("\nGuess a number between 1 to 100, You will have 5 turns!" );
    
    
    int guess;
    int i=0;
    boolean win=false;
	
    while(win==false) {
      guess=scan.nextInt();
      turns++;
    
    if(guess==right_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+right_guess);
      return;
    }
    else if(guess<right_guess){
      i++;
      System.out.println(".... Too Low ");
      
    }
    else if(guess>right_guess) {
      i++;
      System.out.println(".... Too High");
      
    }
    
  }
    System.out.println("You win!");
    System.out.println("Then number was "+right_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    
}
}