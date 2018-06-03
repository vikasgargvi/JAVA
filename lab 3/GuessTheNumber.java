import java.util.Random;

public class GuessTheNumber{

	private int randomNumber;

	/**
	 * parametrised Constructor (only Upper)
	 */
	GuessTheNumber(int h){
		Random r = new Random();
		this.randomNumber = r.nextInt(h + 1);
	}
	
	/**
 	 * Parameterised Constructor (both LOWER and UPPER)
	 */
	GuessTheNumber(int l, int h){
		Random r = new Random();
		this.randomNumber = l + r.nextInt(h -l +1); 
	}

	/**
	 *  compare the user guess with random number
	 */
	public int compare(int guess){
		if(this.randomNumber < guess)
			return -1;
		else if(guess < this.randomNumber)
			return 1;
		else
			return 0;
	}
}