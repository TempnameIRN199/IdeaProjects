import java.time.LocalDate;
import java.time.LocalTime;

import interfaces.FunctionalInterface;

public class Main
{
	public static void main(String[] args)
	{
		FunctionalInterface specObj = new FunctionalInterface()
		{
			@Override
			public <TgtType extends Number> double sum(TgtType firstNum, TgtType secondNum, TgtType thirdNum)
			{ return firstNum.doubleValue() + secondNum.doubleValue() + thirdNum.doubleValue(); }

			@Override
			public <TgtType extends Number> double product(TgtType firstNum, TgtType secondNum, TgtType thirdNum)
			{ return firstNum.doubleValue() * secondNum.doubleValue() * thirdNum.doubleValue(); }

			@Override
			public LocalTime getLocalTime()
			{ return LocalTime.now(); }

			@Override
			public LocalDate getLocalDate()
			{ return LocalDate.now(); }
		};
		
		System.out.println("Sum: " + specObj.sum(4, 2, 8));
		System.out.println("Product: " + specObj.product(8, 2, 1));
		System.out.println("LocalTime: " + specObj.getLocalTime());
		System.out.println("LocalDate: " + specObj.getLocalDate());
	}
}