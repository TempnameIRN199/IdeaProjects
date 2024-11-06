package org.example;

public class Passport {
    private String _series;
    private String _number;

    public Passport(String series, String number) {
        _series = series;
        _number = number;
    }

    public void setSeries(String series) {
        _series = series;
    }

    public String getSeries() {
        return _series;
    }

    public void setNumber(String number) {
        _number = number;
    }

    public String getNumber() {
        return _number;
    }

    public void getPassport() {
        System.out.println("Series: " + _series);
        System.out.println("Number: " + _number);
    }
}
