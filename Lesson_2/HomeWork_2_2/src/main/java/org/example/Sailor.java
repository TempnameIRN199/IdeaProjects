package org.example;

public class Sailor extends Human {
    private String _rank;

    public Sailor(String firstName, String surName, String patronymic, int age, String rank) {
        super(firstName, surName, patronymic, age);
        _rank = rank;
    }

    public void setRank(String rank) {
        _rank = rank;
    }

    public String getRank() {
        return _rank;
    }

    public void getSailor() {
        System.out.println("Name: " + getSurName() + " " + getFirstName() + " " + getPatronymic());
        System.out.println("Age: " + getAge());
        System.out.println("Rank: " + _rank);
    }
}
