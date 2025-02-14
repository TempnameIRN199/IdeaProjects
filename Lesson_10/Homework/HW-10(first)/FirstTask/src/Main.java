import java.util.Random;

import java.util.stream.LongStream;

public class Main
{
	public static void main(String[] args)
	{
		long[] currArr = new long[20];
		
		initRandArr(currArr, -40L, 40L);
		
		System.out.println(LongStream.of(currArr).filter(val -> val > 0).count());
		System.out.println(LongStream.of(currArr).filter(val -> val < 0).count());
		System.out.println(LongStream.of(currArr).filter(val -> val > 9 && val < 100).count());
		System.out.println(LongStream.of(currArr).filter(Main::isPalindrome).count());
	}
	
	private static void initRandArr(long[] arr, long min, long max)
	{
		Random currRandom = new Random();
		
		for (int tmpCounter = 0; tmpCounter < arr.length; tmpCounter++)
			arr[tmpCounter] = currRandom.nextLong(min, max);
	}
	
	private static Boolean isPalindrome(long val)
	{
	    String strNumber = Long.toString(val);

	    String reversed = new StringBuilder(strNumber).reverse().toString();

	    return strNumber.equals(reversed);
    }
}
