package utils;

public final class ArrayFactorialLogic implements Runnable
{
	private int[] tgtArr, rsltArr;
	
	public int[] getTgtArr()
	{ return tgtArr; }

	public void setTgtArr(int[] tgtArr)
	{ this.tgtArr = tgtArr; }

	public int[] getRsltArr()
	{ return rsltArr; }

	public ArrayFactorialLogic()
	{ this(null); }

	public ArrayFactorialLogic(int[] tgtArr)
	{
		this.tgtArr = tgtArr;
	}
	
	@Override
	public void run()
	{
		rsltArr = new int[tgtArr.length];
		
		for (int firstCounter = 0; firstCounter < tgtArr.length; firstCounter++)
		{
			rsltArr[firstCounter] = 1;
			
			for (int secondCounter = 1; secondCounter <= tgtArr[firstCounter]; secondCounter++)
			{
				rsltArr[firstCounter] *= secondCounter;
			}
		}
	}
}
