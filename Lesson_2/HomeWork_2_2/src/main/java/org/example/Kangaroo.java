package org.example;

public class Kangaroo extends Animal{
    private final String _species;

    public Kangaroo(String name, int age, String species) {
        super(name, age);
        this._species = species;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Species: " + _species);
    }
}
