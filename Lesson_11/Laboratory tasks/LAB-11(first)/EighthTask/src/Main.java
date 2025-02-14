import java.util.*;
import java.util.stream.Collectors;

import utils.*;

public class Main
{
	public static void main(String[] args)
	{
		Course math = new Course(1, "Math", (byte) 5);
        Course physics = new Course(2, "Physics", (byte) 4);
        Course history = new Course(3, "History", (byte) 3);

        Student alice = new Student(1, "Alice Johnson", (byte) 3);
        Student bob = new Student(2, "Bob Smith", (byte) 2);
        Student charlie = new Student(3, "Charlie Brown", (byte) 4);

        Enrollment e1 = new Enrollment(1, math, alice, 95.0f);
        Enrollment e2 = new Enrollment(2, math, bob, 80.0f);
        Enrollment e3 = new Enrollment(3, physics, alice, 85.0f);
        Enrollment e4 = new Enrollment(4, history, charlie, 90.0f);
        Enrollment e5 = new Enrollment(5, physics, charlie, 88.0f);

        List<Enrollment> enrollments = Arrays.asList(e1, e2, e3, e4, e5);

        Map<String, Double> averageGradesForCourses = enrollments.stream().
        	filter(enrollment -> enrollment.getStudent().getAge() > 2).
        	collect(Collectors.groupingBy
        	(
                enrollment -> enrollment.getCourse().getTitle(),
                Collectors.averagingDouble(Enrollment::getGrade)
            ));
        
        averageGradesForCourses.forEach((key, val) -> System.out.println(key + " - " + val));
	}
}
