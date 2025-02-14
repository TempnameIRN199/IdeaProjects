package services;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;

public final class NumericTwoDimArrSrvc<TgtType extends Number & Comparable<TgtType>> {
    private TgtType[][] arr;

    public TgtType[][] getArr() {
        return arr;
    }

    public void setArr(TgtType[][] arr) {
        this.arr = arr;
    }

    public NumericTwoDimArrSrvc() { }

    public NumericTwoDimArrSrvc(TgtType[][] arr) {
        this.arr = arr;
    }

    // Constructor to create a random matrix with given dimensions
    public NumericTwoDimArrSrvc(int rows, int cols) {
        this.arr = createEmptyMatrix(rows, cols);
        fillWithRandomValues();
    }

    // Fill the matrix with random values
    private void fillWithRandomValues() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (TgtType) (Number) random.nextInt(100); // Random integers for demonstration
            }
        }
    }

    public TgtType[] toOneDimArr() {
        return Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .toArray(size -> (TgtType[]) Array.newInstance(arr.getClass().getComponentType().getComponentType(), size));
    }

    public NumericTwoDimArrSrvc<TgtType> add(NumericTwoDimArrSrvc<TgtType> other) {
        validateDimensions(other);
        TgtType[][] result = createEmptyMatrix(arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = addNumbers(arr[i][j], other.arr[i][j]);
            }
        }
        return new NumericTwoDimArrSrvc<>(result);
    }

    public NumericTwoDimArrSrvc<TgtType> subtract(NumericTwoDimArrSrvc<TgtType> other) {
        validateDimensions(other);
        TgtType[][] result = createEmptyMatrix(arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = subtractNumbers(arr[i][j], other.arr[i][j]);
            }
        }
        return new NumericTwoDimArrSrvc<>(result);
    }

    public NumericTwoDimArrSrvc<TgtType> multiply(NumericTwoDimArrSrvc<TgtType> other) {
        if (arr[0].length != other.arr.length) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }
        TgtType[][] result = createEmptyMatrix(arr.length, other.arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < other.arr[0].length; j++) {
                result[i][j] = createZero();
                for (int k = 0; k < arr[i].length; k++) {
                    result[i][j] = addNumbers(result[i][j], multiplyNumbers(arr[i][k], other.arr[k][j]));
                }
            }
        }
        return new NumericTwoDimArrSrvc<>(result);
    }

    private TgtType addNumbers(TgtType a, TgtType b) {
        return performOperation(a, b, (x, y) -> x + y);
    }

    private TgtType subtractNumbers(TgtType a, TgtType b) {
        return performOperation(a, b, (x, y) -> x - y);
    }

    private TgtType multiplyNumbers(TgtType a, TgtType b) {
        return performOperation(a, b, (x, y) -> x * y);
    }

    private TgtType performOperation(TgtType a, TgtType b, BiFunction<Double, Double, Double> operation) {
        double result = operation.apply(a.doubleValue(), b.doubleValue());
        return (TgtType) (Number) result;
    }

    private TgtType createZero() {
        return (TgtType) (Number) 0;
    }

    private void validateDimensions(NumericTwoDimArrSrvc<TgtType> other) {
        if (arr.length != other.arr.length || arr[0].length != other.arr[0].length) {
            throw new IllegalArgumentException("Matrices dimensions must match.");
        }
    }

    // Create a new empty matrix of type TgtType
    private TgtType[][] createEmptyMatrix(int rows, int cols) {
        return (TgtType[][]) Array.newInstance(Number.class, rows, cols);
    }

    @Override
    public String toString() {
        return "NumericTwoDimArrSrvc [arr=" + Arrays.deepToString(arr) + "]";
    }

    // New methods for min, max, and avg calculations
    public TgtType min() {
        return Arrays.stream(toOneDimArr()).min(Comparable::compareTo).orElse(null);
    }

    public TgtType max() {
        return Arrays.stream(toOneDimArr()).max(Comparable::compareTo).orElse(null);
    }

    public double avg() {
        return Arrays.stream(toOneDimArr()).mapToDouble(Number::doubleValue).average().orElse(0);
    }
}