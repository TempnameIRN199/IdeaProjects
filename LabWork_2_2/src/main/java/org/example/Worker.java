package org.example;

public abstract class Worker {
    public abstract void Print();
}

class President extends Worker {
    @Override
    public void Print() {
        System.out.println("President");
    }
}

class Security extends Worker {
    @Override
    public void Print() {
        System.out.println("Security");
    }
}

class Manager extends Worker {
    @Override
    public void Print() {
        System.out.println("Manager");
    }
}

class Engineer extends Worker {
    @Override
    public void Print() {
        System.out.println("Engineer");
    }
}
