package utils;

import java.util.stream.IntStream;

public final class SumArrLogic implements Runnable
{
	private int[] arr;
	private int rslt;
	
	public int[] getArr()
	{ return arr;}

	public void setArr(int[] arr)
	{ this.arr = arr; }
	
	public int getRslt()
	{ return rslt; }

	public void setRslt(int rslt)
	{ this.rslt = rslt; }
	
	public SumArrLogic()
	{ this(null); }

	public SumArrLogic(int[] arr)
	{ this.arr = arr; }

	@Override
	public void run()
	{
		rslt = IntStream.of(arr).sum();
	}
}
