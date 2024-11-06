package org.example;

public class Pilot extends Human {
    private String _aircraftType;
    private String _airline;
    private String _licenseNumber;
    private String _rank;

    public Pilot(String surname, String firstName, String patronymic, int age) {
        super(surname, firstName, patronymic, age);
    }

    private void _setPilot(String surName, String firstName, String patronymic, int age,
                           String aircraftType, String airline, String licenseNumber,
                           String rank) {
        super.setHuman(surName, firstName, patronymic, age, null, null, null, null);
        _aircraftType = aircraftType;
        _airline = airline;
        _licenseNumber = licenseNumber;
        _rank = rank;
    }

    public void setPilot(String surName, String firstName, String patronymic, int age,
                         String aircraftType, String airline, String licenseNumber,
                         String rank) {
        _setPilot(surName, firstName, patronymic, age, aircraftType, airline, licenseNumber, rank);
    }

    private void _getPilot() {
        super._getHuman();
        System.out.println("Aircraft type: " + _aircraftType);
        System.out.println("Airline: " + _airline);
        System.out.println("License number: " + _licenseNumber);
        System.out.println("Rank: " + _rank);
    }

    public void setAircraftType(String aircraftType) {
        _aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return _aircraftType;
    }

    public void setAirline(String airline) {
        _airline = airline;
    }

    public String getAirline() {
        return _airline;
    }

    public void setLicenseNumber(String licenseNumber) {
        _licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return _licenseNumber;
    }

    public void setRank(String rank) {
        _rank = rank;
    }

    public String getRank() {
        return _rank;
    }
}
