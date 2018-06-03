import java.util.*;
import java.io.*;

public class Test
{
	public static void main(String[] args)
	{
		FileReader in = null;
		FileWriter out = null;

		try{
			in = new FileReader(args[0]);
			out = new FileWriter(args[1]);
		
		
		Scanner s = new Scanner(in);

		GStack<String> st = new GStack<String>();
		Formatter formatter = new Formatter(out);

		String str;

		while(s.hasNextLine())
		{
			str = s.nextLine();
			StringTokenizer t = new StringTokenizer(str);

			while(t.hasMoreTokens())
		                st.push(t.nextToken());

			
			/*do{
			      str = st.pop();
			      formatter.format("%s", str);
			  }while(str != null);*/

			formatter.format("%s\n",st);
		}

		in.close();
		out.close();
		formatter.close();
		}

		catch(IOException e)
		{
			System.out.println("File not found");
		}

	}
}
