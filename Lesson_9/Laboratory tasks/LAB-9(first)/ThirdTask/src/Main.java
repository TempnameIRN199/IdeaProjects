import utils.ArrayFileSrvc;
import utils.EvenValuesThread;
import utils.OddValuesThread;

import java.util.Random;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		OddValuesThread currOddValuesThread = new OddValuesThread();
		EvenValuesThread currEvenValuesThread = new EvenValuesThread();
		ArrayFileSrvc currArrayFileSrvc = new ArrayFileSrvc("C:\\Users\\Administrator\\Desktop\\FirstTxtDoc.txt");
		
		int[] currArr = new int[10];
		
		initArrRand(currArr, -20, 20 + 1);
		
		try
		{
			// just to initialize
			currArrayFileSrvc.setArr(currArr);
			currArrayFileSrvc.write();	
			
			currArrayFileSrvc.read();
			currEvenValuesThread.setTgtArr(currArrayFileSrvc.getArr());
			currOddValuesThread.setTgtArr(currArrayFileSrvc.getArr());
			
			currEvenValuesThread.start();
			currOddValuesThread.start();
			
			currEvenValuesThread.join();
			currOddValuesThread.join();
			
			currArrayFileSrvc.setFilePath("C:\\Users\\Administrator\\Desktop\\SecondTxtDoc.txt");
			currArrayFileSrvc.setArr(currEvenValuesThread.getRsltArr());
			currArrayFileSrvc.write();
			
			currArrayFileSrvc.setFilePath("C:\\Users\\Administrator\\Desktop\\ThirdTxtDoc.txt");
			currArrayFileSrvc.setArr(currOddValuesThread.getRsltArr());
			currArrayFileSrvc.write();
		}
		catch (Exception exc)
		{
			System.out.println("ERR: " + exc.getMessage());
		}
		
		System.out.println("Arr: " + Arrays.toString(currArr));
		System.out.println("EvenArr: " + Arrays.toString(currEvenValuesThread.getRsltArr()));
		System.out.println("OddArr: " + Arrays.toString(currOddValuesThread.getRsltArr()));
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
