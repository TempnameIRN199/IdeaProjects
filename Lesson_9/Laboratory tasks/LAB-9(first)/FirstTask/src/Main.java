import java.util.Random;
import java.lang.Thread;

import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args)
	{
		Thread firstThread = null, secondThread = null;
		Integer[] currArr = new Integer[10];
		
		initRandArr(currArr, -20, 20 + 1);
		
		firstThread = new Thread(() -> 
		{
			System.out.println(Stream.of(currArr).min((firstVal, secondVal) -> Integer.compare(firstVal, secondVal)).get());
		});
		
		secondThread = new Thread(() ->
		{
			System.out.println(Stream.of(currArr).max((firstVal, secondVal) -> Integer.compare(firstVal, secondVal)).get());
		});
		
		firstThread.start();
		secondThread.start();
		
		try
		{
			firstThread.join();
			secondThread.join();
		}
		catch (Exception exc)
		{
			System.out.print("ERR: " + exc.getMessage());
		}
	}
	
	public static void initRandArr(Integer[] arr, int min, int max)
	{
		Random currRandom = new Random();
		
		for (int counter = 0; counter < arr.length; counter++)
		{
			arr[counter] = currRandom.nextInt(min, max);
		}
	}
}
