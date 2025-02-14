package org.example;

public class Crocodile extends Animal{
    private final String _species;

    public Crocodile(String name, int age, String species) {
        super(name, age);
        this._species = species;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Species: " + _species);
    }
}
