package utils;

import java.util.stream.IntStream;

public final class ArrayPrimeLogic implements Runnable
{
	private int[] tgtArr, rsltArr;
	
	public int[] getTgtArr()
	{ return tgtArr; }

	public void setTgtArr(int[] tgtArr)
	{ this.tgtArr = tgtArr; }

	public int[] getRsltArr()
	{ return rsltArr; }
	
	public ArrayPrimeLogic()
	{ this(null); }
	
	public ArrayPrimeLogic(int[] tgtArr)
	{ this.tgtArr = tgtArr; }
	
	@Override
	public void run()
	{
		rsltArr = IntStream.of(tgtArr).filter(this::isPrime).toArray();
	}
	
	// GPT
    private boolean isPrime(int num)
    {
        // A number less than 2 cannot be prime
        if (num < 2) {
            return false;
        }

        // Check for divisors from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not a prime number
            }
        }

        return true; // If no divisors found, it is a prime number
    }
}
