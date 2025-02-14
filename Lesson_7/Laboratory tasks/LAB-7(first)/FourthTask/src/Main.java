import java.util.function.Predicate;

public class Main
{
	public static void main(String[] args)
	{
		int[] arr = new int[] { 10, 12, 43, 23, 77, 21, 18 };
		
		System.out.println(specLogic(arr, (currInt) -> currInt % 2 == 0));
		System.out.println(specLogic(arr, (currInt) -> currInt % 2 != 0));
		System.out.println(specLogic(arr, (currInt) -> 40 <= currInt && currInt <= 80));
		System.out.println(specLogic(arr, (currInt) -> currInt % 9 == 0));
	}
	
	public static int specLogic(int[] arr, Predicate<Integer> specLambda)
	{
		int rslt = 0;
		
		for(int currInt : arr)
		{
			if (specLambda.test(currInt))
			{
				rslt += currInt;
			}
		}
		
		return rslt;
	}
}
