package services;

import java.util.Random;
import java.util.Arrays;

import interfaces.IStringPresenter;

public final class ArraySrvc<ArrType> implements IStringPresenter
{
	private ArrType tgtArr;
	
	public ArrType getTgtArr()
	{ return tgtArr; }

	public void setTgtArr(ArrType tgtArr)
	{ this.tgtArr = tgtArr; }
	
	public ArraySrvc()
	{ }

	public ArraySrvc(ArrType tgtArr)
	{
		this.tgtArr = tgtArr;
	}

	@Override
	public String createStringPresentation()
	{ return Arrays.toString((int[])tgtArr); }

	@Override
	public String createStringPresentation(Object addtlInfo)
	{ return createStringPresentation() + ' ' + addtlInfo; }
	
	public static class ArraySrvcHelper
	{
		public static void initRandomIntArr(int[] arr, int min, int max)
		{
			Random currRandom = new Random();
			
			for (int counter = 0; counter < arr.length; counter++)
				arr[counter] = currRandom.nextInt(min, max);
		}
	}
}
