package org.example;

public class Area {
    private static int _count = 0;

    public static double _triangleArea(double a, double b, double c) {
        _count++;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double _rectangleArea(double a, double b) {
        _count++;
        return a * b;
    }

    public static double _squareArea(double a) {
        _count++;
        return a * a;
    }

    public static double _rhombusArea(double d1, double d2) {
        _count++;
        return (d1 * d2) / 2;
    }

    public static int _getCount() {
        return _count;
    }
}
