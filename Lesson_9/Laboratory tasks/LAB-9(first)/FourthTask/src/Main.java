import java.nio.file.Files;
import java.nio.file.Paths;

import utils.WordCounterThread;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			WordCounterThread tmpWordCounterThread = new WordCounterThread
					(String.join("", Files.readAllLines(Paths.get("C:\\Users\\Administrator\\Desktop\\FirstJsonDoc.json"))), "FirstPassword");
			
			tmpWordCounterThread.start();
			tmpWordCounterThread.join();
			
			System.out.print("COUNTER: " + tmpWordCounterThread.getCounter());
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
	}
}
