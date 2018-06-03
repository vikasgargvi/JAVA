import java.util.Scanner;

public class GuessTheNumberTest{

	public static void main(String[] args){

		Scanner inp = new Scanner(System.in);
		GuessTheNumber n = null;
		int low = 0;
		int high = 0;

		// MENU for selection of Range
		int choice;
		System.out.println("Choose your range type....\n1. want to enter only upper bound? (Starting from 0)\n2. want to enter both lower and upper bound \nEnter choice: ");
		choice = inp.nextInt();

		if(choice == 1){
			System.out.println("Enter upper bound: ");
			high = inp.nextInt();

			n = new GuessTheNumber(high);
		}
		else if(choice == 2){
			System.out.println("Enter lower bound: ");
			low = inp.nextInt();

			System.out.println("Enter upper bound: ");
			high = inp.nextInt();

			 n = new GuessTheNumber(low,high);
		}

		int guess;

		int ch, count = 0;

		do{
			System.out.println("Range of Number [" + low + "," + high + "]");
			
			int validateGuess;
			do{
				validateGuess = 0;
				System.out.println("Guess the Number: ");
				guess = inp.nextInt();
				if(guess < low || guess > high){
					validateGuess = 1;
					System.out.println("Your guess out of range...Re-enter your guess within specified range");
				}
			}while(validateGuess == 1);
			
			ch = n.compare(guess);
			count++;

			if(ch == -1){
				System.out.println("Number is less than " + guess);
				high = guess - 1;
			}
			else if(ch == 1){
				System.out.println("Number is greater than " + guess);
				low = guess + 1;
			}

		}while(ch != 0);

		System.out.println("Matched!\nYou guessed in " + count + " trial");
	}
}