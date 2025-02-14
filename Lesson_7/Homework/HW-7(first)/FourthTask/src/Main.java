import java.util.function.Predicate;

public class Main
{
	public static void main(String[] args)
	{
		short[] shortArr = new short[] { 1, 2, -3, 4, 5, 6, -7, 8, 9, 10 };
		
		System.out.println("FirstLambda: " + specLogic(shortArr, (currShort) -> currShort == 2));
		System.out.println("SecondLambda: " + specLogic(shortArr, (currShort) -> currShort < 2 || currShort > 8));
		System.out.println("ThirdLambda: " + specLogic(shortArr, (currShort) -> currShort > 0));
		System.out.println("FourthLambda: " + specLogic(shortArr, (currShort) -> currShort < 0));
	}
	
	private static int specLogic(short[] arr, Predicate<Short> lambdaLogic)
	{
		int tmpIntVar = 0;
		
		for (short currShort : arr)
		{
			if (lambdaLogic.test(currShort))
				tmpIntVar += currShort;
		}
		
		return tmpIntVar;
	}
}
