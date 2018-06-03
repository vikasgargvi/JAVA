public class CrapsGame{
	private	Dice dice1 = new Dice();
	private	Dice dice2 = new Dice();

	int d1;
	int d2;
	int i;
	int points;
	int sum;
	
	public CrapsGame()
    {
		i = 1;
		points = 0;
		sum = 0;
		d1 = 0;
		d2 = 0;
	}

	public int play(){
		d1 = dice1.roll();
		System.out.println("\nDice 1: " + d1);
		d2 = dice2.roll();
		System.out.println("Dice 2: " + d2);

		sum = d1 + d2;
		System.out.println("Sum: " + sum);

		System.out.println("Round " + i++); 
		
		if(sum == 7 || sum == 11)
        {
			System.out.println("Users Win");
			return (i*10) + 1;
		}
		else if(sum == 2 || sum == 3 || sum == 12)
        {
			System.out.println("Computer Win");
			return (i*10) + 0;
		}
		else
			points = sum;

		System.out.println("\nPOINTS: " + points + "\n");

		do{
			System.out.println("\nRound " + i++);

			d1 = dice1.roll();
			System.out.println("\nDice 1: " + d1);
			d2 = dice2.roll();
			System.out.println("Dice 2: " + d2);
			
			sum = d1 + d2;
			System.out.println("Sum: " + sum);
			
			if(sum == 7)
            {
				System.out.println("Computer Win");
				return (i*10) + 0;
			}

			if(sum == points)
            {
				System.out.println("Users Win");
				return (i*10) + 1;
			}
		}while(sum != 7 && sum != points);	
        return 0;	
    }
}
