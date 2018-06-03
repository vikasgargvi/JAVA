import java.io.*;
import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("encrypted.txt");

			int i = 0;
			int x = 0XFF;
			int c = 0;

			while((i = in.read()) != -1)
			{
				c = i ^ x;
				out.write((char)c);
			}

			in.close();
			out.close();

			in = new FileInputStream("encrypted.txt");
			out = new FileOutputStream("decrypted.txt");
			i = 0;
			
			while((i = in.read()) != -1)
			{
				c = i ^ x;
				out.write((char)c);
			}
			in.close();
			out.close();
		}

		catch(IOException e)
		{
			System.out.println("Some Issue Occured");
		}
	}
}