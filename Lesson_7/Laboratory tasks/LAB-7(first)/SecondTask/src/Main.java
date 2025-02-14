import java.util.function.BiFunction;
import java.util.function.Function;

public class Main
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> firstFunc =
				(firstNum, secondNum) -> Math.min(firstNum, secondNum);
				
		BiFunction<Integer, Integer, Integer> secondFunc =
				(firstNum, secondNum) -> Math.max(firstNum, secondNum);
				
		Function<Integer, Long> thirdFunc = (Integer num) ->
		{
		    long result = 1;
		    
		    for (int counter = 1; counter <= num; counter++)
		    {
		        result *= counter;
		    }
		    
		    return result;
		};
		
		Function<Integer, Boolean> fourthFunc = (Integer num) ->
		{
			if (num % 2 == 0)
				return true;
			else
				return false;
		};
		
		System.out.println("FirstFunc: " + firstFunc.apply(4, 2));
		System.out.println("SecondFunc: " + secondFunc.apply(8, 2));
		System.out.println("ThirdFunc: " + thirdFunc.apply(8));
		System.out.println("FourthFunc: " + fourthFunc.apply(3));
	}
}
