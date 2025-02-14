package services;

import java.util.Arrays;

public final class SpecSrvc
{
	public static int min(int... values)
	{
		return Arrays.stream(values).min().getAsInt();
	}
	
	public static int max(int... values)
	{
		return Arrays.stream(values).max().getAsInt();
	}
	
	public static double avg(int... values)
	{
		return Arrays.stream(values).average().getAsDouble();
	}
	
	public static int factorial(int value)
	{
		for (int counter = 1, tgtNumber = value; counter < tgtNumber; counter++)
			value *= counter;
		
		return value;
	}
}
