package org.example;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
                new Rectangle(5, 10),
                new Circle(7),
                new RightTriangle(3, 4),
                new Trapezoid(3, 4, 5)
        };

        for (Figure figure : figures) {
            System.out.println("Area: " + figure.calculateArea());
        }

        int[] numbers = {1, 2, 3, 4, 5};
        Array array = new Array(numbers);
        array.Print();
        array.Print(" - Array elements printed");
    }
}
