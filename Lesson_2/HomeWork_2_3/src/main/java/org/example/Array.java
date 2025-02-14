package org.example;
import java.util.Arrays;

public class Array<T extends Comparable<T>> {
    private T[] array;

    public Array(int size) {
        array = (T[]) new Comparable[size];
    }

    public void fillArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    public void fillArrayRandom() {
    for (int i = 0; i < array.length; i++) {
        array[i] = (T) Integer.valueOf((int) (Math.random() * 100));
    }
}

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public double findAverage() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Double.parseDouble(array[i].toString());
        }
        return sum / array.length;
    }

    public void sortAscending() {
        Arrays.sort(array);
    }

    public void sortDescending() {
        Arrays.sort(array, (o1, o2) -> o2.compareTo(o1));
    }

    public int binarySearch(T value) {
        return Arrays.binarySearch(array, value);
    }

    public void replaceValue(T oldValue, T newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
    }
}
