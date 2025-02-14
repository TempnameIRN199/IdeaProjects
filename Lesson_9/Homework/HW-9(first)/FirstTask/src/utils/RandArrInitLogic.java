package utils;

import java.util.Random;

public final class RandArrInitLogic implements Runnable
{
	private int[] arr;
	private int min, max;
	
	public int[] getArr()
	{ return arr; }

	public void setArr(int[] arr)
	{ this.arr = arr; }

	public int getMin()
	{ return min; }

	public void setMin(int min)
	{ this.min = min; }

	public int getMax()
	{ return max; }

	public void setMax(int max)
	{ this.max = max; }

	public RandArrInitLogic(int[] arr, int min, int max)
	{
		this.arr = arr;
		this.min = min;
		this.max = max;
	}

	@Override
	public void run()
	{
		Random currRand = new Random();
		
		for (int tmpCounter = 0; tmpCounter < arr.length; tmpCounter++)
		{
			arr[tmpCounter] = currRand.nextInt(min, max);
		}
	}
}
