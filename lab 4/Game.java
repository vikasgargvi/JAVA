public class Game{
    public static void main(String[] args){

		CrapsGame cg = null;

		int[] win = new int[11];
		int[] loss = new int[11];

		for(int i = 0; i < 11; i++){
			win[i] = 0;
			loss[i] = 0;
		}

		int check;

		for(int i = 1; i <= 1000; i++){
			cg = new CrapsGame();
		    check = cg.play();
		    int r = check / 10;
		    int status = check % 10;

		    if(r <= 10){
				if(status == 1)
				    win[r - 1]++;
				else
					loss[r-1]++;
		    }
		    else{
				if(status == 1)
	                win[10]++;
			 	else
	                loss[10]++;
		    }
		}

		System.out.println("\nRound Wins Lost ");
		for(int i = 0; i < 11; i++){
		    System.out.println(i+1 + "\t" + win[i] + "\t" + loss[i]);
		}
    }
}
