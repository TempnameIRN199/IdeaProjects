import java.lang.Thread;

import java.util.Random;

import java.util.stream.Stream;

import utils.*;

public class Main
{
	public static void main(String[] args)
	{
		Integer[] currIntegerArr = new Integer[10];
		
		ArrSumThread currArrSumThread = new ArrSumThread(currIntegerArr);
		ArrAvgThread currArrAvgThread = new ArrAvgThread(currIntegerArr);
		
		initArrRand(currIntegerArr, -20, 20 + 1);
		
		currArrSumThread.start();
		currArrAvgThread.start();
		
		try
		{
			currArrSumThread.join();
			currArrAvgThread.join();
		}
		catch(Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
		
		System.out.println("SUM: "+  currArrSumThread.getResult());
		System.out.println("AVG: " + currArrAvgThread.getResult());
	}
	
	public static void initArrRand(Integer[] arr, Integer min, Integer max)
	{
		Random currRandom = new Random();
		
		for (int counter = 0; counter < arr.length; counter++)
		{
			arr[counter] = currRandom.nextInt(min, max);
		}
	}
}
