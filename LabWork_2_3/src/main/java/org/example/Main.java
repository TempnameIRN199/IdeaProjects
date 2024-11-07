package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Service.maxOfThree(10, 20, 15));
        System.out.println(Service.minOfFive(10, 20, 5, 15, 25));
        System.out.println(Service.average(numbers));
        System.out.println(Service.maxInArray(numbers));
        System.out.println(Service.minInArray(numbers));

        Service.sortArray(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Service.binarySearch(numbers, 3));
    }
}