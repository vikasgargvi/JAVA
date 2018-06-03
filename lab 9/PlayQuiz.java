import java.util.*;
import java.io.*;

public class PlayQuiz
{
	public static void main(String[] args)
	{
		ObjectInputStream input;
		int correct = 0;
		int wrong = 0;
		
		try
		{
			FileInputStream file = new FileInputStream("ques.txt");
			input = new ObjectInputStream(file);

			Scanner in = new Scanner(System.in);
			boolean an;
			

			while(file.available() > 0)
			{
				Question q = (Question) input.readObject();

				System.out.println("Question: " + q.getQues());
				System.out.print("Answer: ");
				an = in.nextBoolean();

				if(an == q.getAns())
					correct++;
				else
					wrong++;
			}
			//input.close();
		}
		catch (EOFException endOfFileException)
		{
			System.out.printf("%No more records%n");
		}
		 catch (ClassNotFoundException classNotFoundException)
 		{
 			System.err.println("Invalid object type. Terminating.");
		}
		 catch (IOException ioException)
 		{
 			System.err.println("Error reading from file. Terminating.");
 		}
 		

 		System.out.println("Correct: " + correct + "\nWrong: " + wrong);	

	}
}