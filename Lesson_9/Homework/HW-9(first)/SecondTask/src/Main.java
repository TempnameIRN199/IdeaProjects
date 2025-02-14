import utils.ArrayFileSrvc;

import utils.ArrayPrimeLogic;
import utils.ArrayFactorialLogic;

import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Thread;

public class Main
{
	public static void main(String[] args)
	{
		ArrayPrimeLogic currArrayPrimeLogic = new ArrayPrimeLogic();
		ArrayFactorialLogic currArrayFactorialLogic = new ArrayFactorialLogic();
		ArrayFileSrvc currArrayFileSrvc = new ArrayFileSrvc("C:\\Users\\Administrator\\Desktop\\FirstTxtDoc.txt");
		
		int[] currArr = new int[10];
		
		initArrRand(currArr, -20, 20 + 1);
		
		try
		{
			// just to initialize
			currArrayFileSrvc.setArr(currArr);
			currArrayFileSrvc.write();	
			
			currArrayFileSrvc.read();
			currArrayPrimeLogic.setTgtArr(currArrayFileSrvc.getArr());
			currArrayFactorialLogic.setTgtArr(currArrayFileSrvc.getArr());
			
			Thread tmpArrayPrimeThread = new Thread(currArrayPrimeLogic);
			Thread tmpArrayFactorialThread = new Thread(currArrayFactorialLogic);
			
			tmpArrayPrimeThread.start();
			tmpArrayFactorialThread.start();
			
			tmpArrayPrimeThread.join();
			tmpArrayFactorialThread.join();
			
			currArrayFileSrvc.setFilePath("C:\\Users\\Administrator\\Desktop\\SecondTxtDoc.txt");
			currArrayFileSrvc.setArr(IntStream.concat(IntStream.of(currArrayPrimeLogic.getRsltArr()),
					IntStream.of(currArrayFactorialLogic.getRsltArr())).toArray());
			currArrayFileSrvc.write();
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
		
		System.out.println("Arr: " + Arrays.toString(currArr));
		System.out.println("Prime: " + Arrays.toString(currArrayPrimeLogic.getRsltArr()));
		System.out.println("Factorial: " + Arrays.toString(currArrayFactorialLogic.getRsltArr()));
	}
	
	private static void initArrRand(int[] arr, int min, int max)
	{
		Random currRand = new Random();
		
		for (int counter = 0; counter < arr.length; counter++)
		{
			arr[counter] = currRand.nextInt(min, max);
		}
	}
}
