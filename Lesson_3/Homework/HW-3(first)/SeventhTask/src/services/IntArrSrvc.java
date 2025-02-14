package services;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

import interfaces.IMath;
import interfaces.ISort;
import interfaces.IStringPresenter;

public final class IntArrSrvc implements IMath, ISort, IStringPresenter
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
	public void sortAsc()
	{ Arrays.sort(tgtArr); }

	@Override
	public void sortDsc()
	{
	    // Convert int[] to Integer[]
	    Integer[] integerArray = Arrays.stream(tgtArr).boxed().toArray(Integer[]::new);
	    
	    // Sort in descending order using Collections.reverseOrder()
	    Arrays.sort(integerArray, Collections.reverseOrder());
	    
	    // Convert Integer[] back to int[]
	    tgtArr = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
	}

	@Override
	public String createStringPresentation()
	{ return Arrays.toString((int[])tgtArr); }

	@Override
	public String createStringPresentation(Object addtlInfo)
	{ return createStringPresentation() + ' ' + addtlInfo; }
}
