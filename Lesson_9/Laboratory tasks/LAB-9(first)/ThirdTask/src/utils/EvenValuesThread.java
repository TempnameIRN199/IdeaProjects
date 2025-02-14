package utils;

import java.util.stream.IntStream;

public final class EvenValuesThread extends Thread
{
	private int[] tgtArr, rsltArr;	

	public int[] getTgtArr()
	{ return tgtArr; }

	public void setTgtArr(int[] tgtArr)
	{ this.tgtArr = tgtArr; }

	public int[] getRsltArr()
	{ return rsltArr; }
	
	public EvenValuesThread()
	{
		this(null);
	}

	public EvenValuesThread(int[] tgtArr)
	{
		this("evenValuesThread", tgtArr);
	}
	
	public EvenValuesThread(String name, int[] tgtArr)
	{
		super(name);
		
		this.tgtArr = tgtArr;
	}
	
	@Override
	public void run()
	{
		rsltArr = IntStream.of(tgtArr).filter((val) -> val % 2 == 0).toArray();
	}
}
