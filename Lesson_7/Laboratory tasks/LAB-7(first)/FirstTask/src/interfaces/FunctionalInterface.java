package interfaces;

import java.time.LocalTime;
import java.time.LocalDate;

public interface FunctionalInterface
{
	<TgtType extends Number> double sum(TgtType firstNum, TgtType secondNum, TgtType thirdNum);
	
	<TgtType extends Number> double product(TgtType firstNum, TgtType secondNum, TgtType thirdNum);
	
	LocalTime getLocalTime();
	
	LocalDate getLocalDate();
}
