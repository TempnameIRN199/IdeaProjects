import java.util.function.BinaryOperator;

import utilities.Fraction;

public class Main
{
	public static void main(String[] args)
	{
		Fraction currFirstFraction = new Fraction(2, 4),
				currSecondFraction = new Fraction(7, 8);
		
		BinaryOperator<Fraction> firstLogic = (firstFraction, secondFraction) ->
			firstFraction.add(secondFraction);
			
		BinaryOperator<Fraction> secondLogic = (firstFraction, secondFraction) ->
			firstFraction.subtract(secondFraction);
			
		BinaryOperator<Fraction> thirdLogic = (firstFraction, secondFraction) ->
			firstFraction.multiply(secondFraction);
		
		BinaryOperator<Fraction> fourthLogic = (firstFraction, secondFraction) ->
			firstFraction.divide(secondFraction);
			
		System.out.println("FirstLogic: " + firstLogic.apply(currFirstFraction, currSecondFraction));
		System.out.println("SecondLogic: " + secondLogic.apply(currFirstFraction, currSecondFraction));
		System.out.println("ThirdLogic: " + thirdLogic.apply(currFirstFraction, currSecondFraction));
		System.out.println("FourthLogic: " + fourthLogic.apply(currFirstFraction, currSecondFraction));
	}
}
