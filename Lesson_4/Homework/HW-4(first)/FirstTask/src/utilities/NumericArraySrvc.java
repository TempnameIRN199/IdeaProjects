package utilities;

import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

public final class NumericArraySrvc<TgtType extends Number & Comparable<TgtType>> {
    private TgtType[] arr;
    private final Class<TgtType> type;

    public NumericArraySrvc(TgtType[] arr, Class<TgtType> type) {
        this.arr = arr;
        this.type = type;
    }

    public void randomInit() {
        Random currRandom = new Random();
        for (int counter = 0; counter < arr.length; counter++) {
            if (type == Integer.class) {
                arr[counter] = type.cast(currRandom.nextInt(100)); // Casts to Integer
            } else if (type == Double.class) {
                arr[counter] = type.cast(currRandom.nextDouble() * 100); // Casts to Double
            } else {
                throw new UnsupportedOperationException("Unsupported type for random initialization");
            }
        }
    }

    public TgtType min() {
        return Arrays.stream(arr).min(Comparator.naturalOrder()).get();
    }

    public TgtType max() {
        return Arrays.stream(arr).max(Comparator.naturalOrder()).get();
    }

    public double avg() {
        return Arrays.stream(arr).mapToDouble(Number::doubleValue).average().getAsDouble();
    }

    public void sortAsc() {
        Arrays.sort(arr, Comparator.naturalOrder());
    }

    public void sortDsc() {
        Arrays.sort(arr, Comparator.reverseOrder());
    }

    public int indexOf(TgtType firstValue) {
        return Arrays.asList(arr).indexOf(firstValue);
    }

    public void replace(TgtType firstValue, TgtType secondValue) {
        int firstValueIndex = indexOf(firstValue);
        if (firstValueIndex != -1)
            arr[firstValueIndex] = secondValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}