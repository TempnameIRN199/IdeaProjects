package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] numbers = {3, 5, 7, 2, 8};
        //Array array = new Array(numbers);

        //System.out.println("Array: " + Arrays.toString(numbers));
        //System.out.println("Max: " + array.Max());
        //System.out.println("Min: " + array.Min());
        //System.out.println("Avg: " + array.Avg());


        int[] array = {5, 3, 8, 1, 2};
        Array_ISort arraySort = new Array_ISort(array);

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        arraySort.SortAsc();
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        arraySort.SortDesc();
        System.out.println("Sorted array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}