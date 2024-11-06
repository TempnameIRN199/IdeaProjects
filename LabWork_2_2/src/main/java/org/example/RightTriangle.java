package org.example;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
