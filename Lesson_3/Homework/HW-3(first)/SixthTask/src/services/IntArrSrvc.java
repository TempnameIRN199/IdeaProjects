package services;

import java.util.Random;
import java.util.Arrays;

import interfaces.IStringPresenter;
import interfaces.IMath;

public final class IntArrSrvc implements IStringPresenter, IMath
{
	private int[] tgtArr;
	
	public int[] getTgtArr()
	{ return tgtArr; }

	public void setTgtArr(int[] tgtArr)
	{ this.tgtArr = tgtArr; }
	
	public IntArrSrvc()
	{ this(null); }

	public IntArrSrvc(int[] tgtArr)
	{
		this.tgtArr = tgtArr;
	}
	
	public void initRandom(int min, int max)
	{
		Random currRandom = new Random();
		
		for (int counter = 0; counter < tgtArr.length; counter++)
			tgtArr[counter] = currRandom.nextInt(min, max);
	}

	@Override
	public int min()
	{ return Arrays.stream(tgtArr).min().getAsInt(); }

	@Override
	public int max()
	{ return Arrays.stream(tgtArr).max().getAsInt(); }

	@Override
	public double avg()
	{ return Arrays.stream(tgtArr).average().getAsDouble(); }

	@Override
	public String createStringPresentation()
	{ return Arrays.toString((int[])tgtArr); }

	@Override
	public String createStringPresentation(Object addtlInfo)
	{ return createStringPresentation() + ' ' + addtlInfo; }
}
