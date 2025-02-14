import java.time.LocalDate;
import java.time.ZoneId;
import java.time.DayOfWeek;
import java.time.temporal.ChronoUnit;

import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.Function;

import java.util.Date;

public class Main
{
	public static void main(String[] args)
	{
		Predicate<Integer> firstLogic = (year) ->
		{
			if (year % 4 == 0)
			{
	            if (year % 100 == 0)
	            {
	                return year % 400 == 0;
	            }
	            
	            return true;
	        }
			
	        return false;
		};
		
		BiFunction<Date, Date, Long> secondLogic = (firstDate, secondDate) ->
			ChronoUnit.DAYS.between
			(
				LocalDate.of(firstDate.getYear(), firstDate.getMonth(), firstDate.getDay()),
				LocalDate.of(secondDate.getYear(), secondDate.getMonth(), secondDate.getDay())
			);
			
		BiFunction<Date, Date, Long> thirdLogic = (firstDate, secondDate) ->
		secondLogic.apply(firstDate, secondDate) / 7;
		
		Function<Date, DayOfWeek> fourthLogic = (date) ->
		date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek();
		
		System.out.println("FirstLogic: " + firstLogic.test(2034));
		System.out.println("SecondLogic: " + secondLogic.apply(new Date(1980, 7, 3), new Date(1967, 4, 6)));
		System.out.println("ThirdLogic: " + thirdLogic.apply(new Date(1980, 7, 3), new Date(1967, 4, 6)));
		System.out.println("FourthLogic: " + fourthLogic.apply(new Date()));
	}
}
