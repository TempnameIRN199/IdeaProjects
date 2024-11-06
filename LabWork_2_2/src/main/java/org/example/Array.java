package org.example;

public class Array implements IShow {
    private final int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public void Print() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(info);
    }
}