package utils;

import java.util.stream.Stream;

public final class ArrSumThread extends Thread
{
	private Integer[] arr;
	private int result;
	
	public Integer[] getArr()
	{ return arr; }

	public int getResult()
	{ return result; }

	public ArrSumThread(Integer[] arr)
	{
		this("arrSumThread", arr);
	}
	
	public ArrSumThread(String name, Integer[] arr)
	{
		super(name);
		
		this.arr = arr;
	}
	
	@Override
	public void run()
	{
		Stream.of(arr).forEach((Integer val) -> this.result += val);
	}
}
