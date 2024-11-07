package org.example;

public class Device {
    private final String name;

    public Device(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Device sound");
    }

    public void show() {
        System.out.println("Device name: " + name);
    }

    public void desc() {
        System.out.println("Device description");
    }
}

class Kettle extends Device {
    public Kettle(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Kettle sound");
    }

    @Override
    public void desc() {
        System.out.println("Kettle description");
    }
}

class Microwave extends Device {
    public Microwave(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Microwave sound");
    }

    @Override
    public void desc() {
        System.out.println("Microwave description");
    }
}

class Car extends Device {
    public Car(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Car sound");
    }

    @Override
    public void desc() {
        System.out.println("Car description");
    }
}

class Steamboat extends Device {
    public Steamboat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Steamboat sound");
    }

    @Override
    public void desc() {
        System.out.println("Steamboat description");
    }
}