import utils.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
        Student[] students = new Student[]
        {
        	new Student("Smith", "John", "Edward", new double[]{ 4.5D, 3.7D, 5.0D, 4.2D, 4.8D, 3.9D, 4.6D }),
        	new Student("Johnson", "Emily", "Rose", new double[]{ 4.0D, 4.2D, 3.8D, 4.5D, 3.9D, 4.1D, 4.4D }),
        	new Student("Williams", "Michael", "Thomas", new double[]{ 3.5D, 3.8D, 4.0D, 4.3D, 3.6D, 3.7D, 4.2D }),
        	new Student("Brown", "Jessica", "Marie", new double[]{ 5.0D, 4.9D, 5.0D, 4.8D, 5.0D, 4.7D, 4.9D }),
        	new Student("Davis", "David", "James", new double[]{ 4.1D, 4.3D, 4.0D, 3.9D, 4.5D, 4.0D, 4.2D }),
        	new Student("Miller", "Sophia", "Alice", new double[]{ 3.9D, 4.5D, 4.2D, 4.4D, 3.8D, 4.6D, 4.1D }),
        	new Student("Wilson", "Daniel", "John", new double[]{ 4.4D, 4.6D, 4.7D, 5.0D, 4.5D, 4.3D, 4.8D }),
        	new Student("Moore", "Olivia", "Grace", new double[]{ 5.0D, 4.8D, 4.9D, 4.7D, 5.0D, 4.6D, 4.9D })
        };
        
        
        Map<String, Double> averageGradesMap = Arrays.stream(students).
        	collect(Collectors.toMap
        	(
        		Student::getName,
                student -> (double) Arrays.stream(student.getGrades()).average().orElse(0.0)
            ));

        Map<String, Double> sortedMap = averageGradesMap.entrySet().
        		stream().
        		sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())).
        		collect(Collectors.toMap
        		(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1,
                    LinkedHashMap::new
                ));
        
        sortedMap.forEach((key, val) -> System.out.println(key + " - " + val));
      }
}
