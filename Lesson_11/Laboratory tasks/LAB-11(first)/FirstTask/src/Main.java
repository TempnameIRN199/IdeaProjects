import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utils.Person;

public final class Main
{
	public static void main(String[] args)
	{
        Person[] people = new Person[]
        {
        	new Person("Smith", "John", "Alexander", (short) 30, "New York, USA"),
        	new Person("Smith", "James", "Alexander", (short) 30, "New York, USA"),
            new Person("Garcia", "Maria", "Isabel", (short) 25, "Madrid, Spain"),
            new Person("Kim", "Jin", "Hyeon", (short) 40, "Seoul, South Korea"),
            new Person("Nguyen", "Linh", "Thuy", (short) 35, "Ho Chi Minh City, Vietnam"),
            new Person("Ivanov", "Ivan", "Ivanovich", (short) 30, "Moscow, Russia"),
            new Person("Patel", "Amit", "Rajesh", (short) 28, "Mumbai, India"),
            new Person("Müller", "Anna", "Lena", (short) 50, "Berlin, Germany"),
            new Person("Brown", "Emily", "Grace", (short) 22, "London, UK")
        };
		
		Map<String, List<String>> rsltMap =
				Stream.of(people).collect(Collectors.groupingBy
						(Person::getResidencePlace, Collectors.mapping(Person::getName, Collectors.toList())));
		
		rsltMap.forEach((place, name) -> System.out.println(place + " : " + name));
	}
}
