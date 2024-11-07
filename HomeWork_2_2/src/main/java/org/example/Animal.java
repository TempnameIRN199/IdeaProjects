package org.example;

public class Animal {
    private final String _name;
    private final int _age;

    public Animal(String name, int age) {
        this._name = name;
        this._age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + _name);
        System.out.println("Age: " + _age);
    }
}
