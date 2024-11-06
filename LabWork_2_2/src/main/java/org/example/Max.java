package org.example;

public class Max {
    public static int _max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int _min(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static double _average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static int _factorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * _factorial(a - 1);
    }
}
