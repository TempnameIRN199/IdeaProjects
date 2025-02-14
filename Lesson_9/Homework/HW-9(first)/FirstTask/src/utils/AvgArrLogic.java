package utils;

import java.util.stream.IntStream;

public final class AvgArrLogic implements Runnable
{
	private int[] arr;
	private double rslt;
	
	public int[] getArr()
	{ return arr;}

	public void setArr(int[] arr)
	{ this.arr = arr; }
	
	public double getRslt()
	{ return rslt; }

	public void setRslt(int rslt)
	{ this.rslt = rslt; }
	
	public AvgArrLogic()
	{ this(null); }

	public AvgArrLogic(int[] arr)
	{ this.arr = arr; }

	@Override
	public void run()
	{
		rslt = IntStream.of(arr).sum() / arr.length;
	}
}
