import java.io.*;
import java.util.*;

public class CreateQuiz
{
	public static void main(String[] args)
	{
		try
		{
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ques.txt"));

			Scanner in = new Scanner(System.in);
			Scanner inQ = new Scanner(System.in);

			
			Question q;
			String ques;
			boolean ans;
			int c = 0;

			do{
				System.out.print("Question: ");
				ques = inQ.nextLine();
				System.out.print("Answer: ");
				ans = in.nextBoolean();

				q = new Question(ques, ans);

				output.writeObject(q);

				System.out.println("exit to -1");
				c = in.nextInt();
			}while(c != -1);

			output.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("no more data");
		}
	}
}