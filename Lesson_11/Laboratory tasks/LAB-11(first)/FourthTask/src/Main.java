import utils.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
        Employee[] employeeArr = new Employee[]
        {
        	new Employee("Smith", "John", "Edward", 55000, "Engineering"),
            new Employee("Doe", "Jane", "Elizabeth", 60000, "Engineering"),
            new Employee("Brown", "James", "Michael", 50000, "Engineering"),
            new Employee("Taylor", "Emily", "Rose", 70000, "Engineering"),
            new Employee("Anderson", "Chris", "Robert", 80000, "IT"),
            new Employee("Johnson", "Mary", "Ann", 75000, "Finance"),
            new Employee("Walker", "David", "Paul", 72000, "Engineering"),
            new Employee("Harris", "Sophia", "Grace", 65000, "Marketing"),
            new Employee("Martinez", "Carlos", "Miguel", 54000, "Sales"),
            new Employee("Davis", "Laura", "Evelyn", 58000, "HR"),
            new Employee("Wilson", "Andrew", "Thomas", 82000, "IT"),
            new Employee("Moore", "Olivia", "Lynn", 90000, "Finance")
        };
        
        Map<String, List<Employee>> specMap = Arrays.stream(employeeArr).
        	collect(Collectors.groupingBy(Employee::getDepartment)).
        	entrySet().stream().
       		collect(Collectors.toMap
       		(
       			Map.Entry::getKey,
                entry -> entry.getValue().stream().
                sorted((firstVal, secondVal) -> Double.compare(secondVal.getSalary(), firstVal.getSalary())).
                limit(3).
                collect(Collectors.toList())
            ));
        
        specMap.forEach((key, val) -> System.out.println(key + " - " + val));
	}
}
