package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WordCounterThread extends Thread
{
	private String baseText, tgtText;
	private int counter;

	public String getBaseText()
	{ return baseText; }

	public void setBaseText(String baseText)
	{ this.baseText = baseText; }

	public String getTgtText()
	{ return tgtText; }

	public void setTgtText(String tgtText)
	{ this.tgtText = tgtText; }

	public int getCounter()
	{ return counter; }

	public WordCounterThread(String baseText, String tgtText)
	{
		this("wordCounterThread", baseText, tgtText);
	}
	
	public WordCounterThread(String name, String baseText, String tgtText)
	{
		super(name);
		
		this.baseText = baseText;
		this.tgtText = tgtText;
	}
	
	@Override
	public void run()
	{
		Matcher currMatcher = Pattern.compile(this.tgtText).matcher(this.baseText);
		
		while (currMatcher.find())
		{
			++this.counter;
		}
	}
}
