package org.example;

import java.text.DateFormat;

public class Human {
    private String _surName;
    private String _firstName;
    private String _patronymic;
    private DateFormat _birthDate;
    private String _phoneNumber;
    private String _country;
    private String _address;
    private static int _count = 0;

    public Human(String surname, String firstName, String patronymic) {
        _surName = surname;
        _firstName = firstName;
        _patronymic = patronymic;
    }

    private void _setHuman(String surName, String firstName, String patronymic,
                           DateFormat birthDate, String phoneNumber, String country,
                           String address) {
        _surName = surName;
        _firstName = firstName;
        _patronymic = patronymic;
        _birthDate = birthDate;
        _phoneNumber = phoneNumber;
        _country = country;
        _address = address;
        _count++;
    }

    public void setHuman(String surName, String firstName, String patronymic,
                         DateFormat birthDate, String phoneNumber, String country,
                         String address) {
        _setHuman(surName, firstName, patronymic, birthDate, phoneNumber, country, address);
    }

    private void _getHuman() {
        System.out.println("Surname: " + _surName);
        System.out.println("First name: " + _firstName);
        System.out.println("Patronymic: " + _patronymic);
        System.out.println("Birth date: " + _birthDate);
        System.out.println("Phone number: " + _phoneNumber);
        System.out.println("Country: " + _country);
        System.out.println("Address: " + _address);
    }

    public void setSurName(String surName) {
        _surName = surName;
    }

    public String getSurName() {
        return _surName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
    }

    public String getPatronymic() {
        return _patronymic;
    }

    public void setBirthDate(DateFormat birthDate) {
        _birthDate = birthDate;
    }

    public DateFormat getBirthDate() {
        return _birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setCountry(String country) {
        _country = country;
    }

    public String getCountry() {
        return _country;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getAddress() {
        return _address;
    }

    public static int getCount() {
        return _count;
    }

}
