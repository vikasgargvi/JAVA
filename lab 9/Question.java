import java.io.*;
import java.util.*;

public class Question implements Serializable
{
	private String ques;
	private boolean ans;

	public Question(String q, boolean a)
	{
		this. ques = q;
		this.ans = a;
	}

	public void setQues(String q)
	{
		this.ques = q;
	}

	public String getQues()
	{
		return this.ques;
	}

	public void setAns(boolean a)
	{
		this.ans = a;
	}

	public boolean getAns()
	{
		return this.ans;
	}
}