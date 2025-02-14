package org.example;
import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = (T[][]) new Number[rows][columns];
    }

    public void fillMatrix(T[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public void fillMatrixRandom() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (T) Integer.valueOf((int) (Math.random() * 100));
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public Matrix<T> add(Matrix<T> matrix) {
        Matrix<T> result = new Matrix<>(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result.matrix[i][j] = (T) Integer.valueOf(this.matrix[i][j].intValue() + matrix.matrix[i][j].intValue());
            }
        }
        return result;
    }

    public Matrix<T> subtract(Matrix<T> matrix) {
        Matrix<T> result = new Matrix<>(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result.matrix[i][j] = (T) Integer.valueOf(this.matrix[i][j].intValue() - matrix.matrix[i][j].intValue());
            }
        }
        return result;
    }

    public Matrix<T> multiply(Matrix<T> matrix) {
        Matrix<T> result = new Matrix<>(this.matrix.length, matrix.matrix[0].length);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < matrix.matrix[0].length; j++) {
                result.matrix[i][j] = (T) Integer.valueOf(0);
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result.matrix[i][j] = (T) Integer.valueOf(result.matrix[i][j].intValue() + this.matrix[i][k].intValue() * matrix.matrix[k][j].intValue());
                }
            }
        }
        return result;
    }
}