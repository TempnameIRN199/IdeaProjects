package services;

import java.util.Arrays;
import java.util.Comparator;

public final class SpecSrvc
{
	@SafeVarargs
	public static <TgtType extends Comparable<TgtType>> TgtType firstMethod(TgtType... values)
	{ return Arrays.stream(values).min(Comparator.naturalOrder()).get(); }
	
	@SafeVarargs
	public static <TgtType extends Comparable<TgtType>> TgtType secondMethod(TgtType... values)
	{ return Arrays.stream(values).max(Comparator.naturalOrder()).get(); }
	
	public static <TgtType extends Number> double thirdMethod(TgtType[] arr)
	{ return Arrays.stream(arr).mapToDouble(Number::doubleValue).average().getAsDouble(); } 
	
	public static <TgtType extends Comparable<TgtType>> TgtType fourthMethod(TgtType[] arr)
	{ return Arrays.stream(arr).min(Comparator.naturalOrder()).orElse(null); }
	
	public static <TgtType extends Comparable<TgtType>> TgtType fifthMethod(TgtType[] arr)
	{ return Arrays.stream(arr).max(Comparator.naturalOrder()).orElse(null); } 
	
	public static <TgtType extends Comparable<TgtType>> void sixthMethod(TgtType[] arr)
	{ Arrays.sort(arr, Comparator.naturalOrder());}
	
	public static <TgtType extends Comparable<TgtType>> int seventhMethod(TgtType[] arr, TgtType value)
	{
		return Arrays.stream(arr).
				filter(currValue -> currValue.compareTo(value) == 0).findFirst().
				map(currValue -> Arrays.asList(arr).indexOf(currValue)).orElse(-1);
	}
}
