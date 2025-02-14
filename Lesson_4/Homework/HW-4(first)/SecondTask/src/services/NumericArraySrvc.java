package services;

import java.util.Arrays;
import java.util.Comparator;

public final class NumericArraySrvc<TgtType extends Number & Comparable<TgtType>> {
    private TgtType[] arr;

    public NumericArraySrvc(TgtType[] arr) {
        this.arr = arr;
    }

    public void randomInit() {
        // This method can be kept for other use cases but isn't needed here
    }

    public TgtType min() {
        return Arrays.stream(arr).min(Comparator.naturalOrder()).orElse(null);
    }

    public TgtType max() {
        return Arrays.stream(arr).max(Comparator.naturalOrder()).orElse(null);
    }

    public double avg() {
        return Arrays.stream(arr).mapToDouble(Number::doubleValue).average().orElse(0);
    }

    public void sortAsc() {
        Arrays.sort(arr, Comparator.naturalOrder());
    }

    public void sortDsc() {
        Arrays.sort(arr, Comparator.reverseOrder());
    }

    public int indexOf(TgtType value) {
        return Arrays.asList(arr).indexOf(value);
    }

    public void replace(TgtType oldValue, TgtType newValue) {
        int index = indexOf(oldValue);
        if (index != -1) {
            arr[index] = newValue;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}