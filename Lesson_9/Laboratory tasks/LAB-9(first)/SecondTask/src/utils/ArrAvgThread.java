package utils;

public final class ArrAvgThread extends Thread
{
	private Integer[] arr;
	private double result;
	
	public Integer[] getArr()
	{ return arr; }

	public double getResult()
	{ return result; }

	public ArrAvgThread(Integer[] arr)
	{
		this("arrAvgThread", arr);
	}
	
	public ArrAvgThread(String name, Integer[] arr)
	{
		super(name);
		
		this.arr = arr;
	}
	
	@Override
	public void run()
	{
		ArrSumThread currArrSumThread = new ArrSumThread(arr);
		
		currArrSumThread.start();
		try
		{
			currArrSumThread.join();			
		}
		catch (Exception exc)
		{ }
		
		this.result = ((double)currArrSumThread.getResult() / arr.length);
	}
}
