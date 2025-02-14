package org.example;
import java.util.Arrays;

public class Service {
    public static <T extends Comparable<T>> T maxOfThree(T a, T b, T c) {
        T max = a.compareTo(b) > 0 ? a : b;
        return max.compareTo(c) > 0 ? max : c;
    }

    public static <T extends Comparable<T>> T minOfFive(T a, T b, T c, T d, T e) {
        T min = a.compareTo(b) < 0 ? a : b;
        min = min.compareTo(c) < 0 ? min : c;
        min = min.compareTo(d) < 0 ? min : d;
        return min.compareTo(e) < 0 ? min : e;
    }

    public static <T extends Number> double average(T[] array) {
        double sum = 0.0;
        for (T value : array) {
            sum += value.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Comparable<T>> T maxInArray(T[] array) {
        T max = array[0];
        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T minInArray(T[] array) {
        T min = array[0];
        for (T value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }


    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, key);
    }

}
