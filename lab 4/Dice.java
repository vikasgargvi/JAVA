import java.util.Random;

public class Dice{
	private int faceValue;

	public Dice(){
		this.faceValue = 0;
	}

	public int roll(){
		Random r = new Random();
		this.faceValue = 1 + r.nextInt(6);
		return this.faceValue;
	}
}