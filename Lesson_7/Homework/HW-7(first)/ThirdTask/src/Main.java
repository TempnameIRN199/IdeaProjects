import interfaces.*;

public class Main
{
	public static void main(String[] args)
	{
		MinLambda<Double> minLambda = (firstNum, secondNum, thirdNum, fourthNum) ->
			Math.min(fourthNum, Math.min(thirdNum, Math.min(secondNum, firstNum)));
		
		MaxLambda<Double> maxLambda = (firstNum, secondNum, thirdNum, fourthNum) ->
			Math.max(fourthNum, Math.max(thirdNum, Math.max(secondNum, firstNum)));
			
		System.out.println("MinLambda: " + minLambda.get(4D, 8D, 1D, 0D));
		System.out.println("MaxLambda: " + maxLambda.get(4D, 8D, 1D, 0D));
	}
}
