package org.example;
// За допомогою механізму наслідування, реалізуйте клас Builder (містить інформацію про будівельника)
public class Builder extends Human {
    private String _specialization;

    public Builder(String firstName, String surName, String patronymic, int age, String specialization) {
        super(firstName, surName, patronymic, age);
        _specialization = specialization;
    }

    public void setSpecialization(String specialization) {
        _specialization = specialization;
    }

    public String getSpecialization() {
        return _specialization;
    }

    public void getBuilder() {
        System.out.println("Name: " + getSurName() + " " + getFirstName() + " " + getPatronymic());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + _specialization);
    }
}
