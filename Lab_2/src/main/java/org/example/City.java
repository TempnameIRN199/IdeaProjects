package org.example;

import java.util.Scanner;

public class City
{
    private String _name;
    private String _region;
    private String _district;
    private int _population;
    private String _index;
    private String _mobileCode;

    public void setCity(String name, String region, String district, int population, String index, String mobileCode) {
        _name = name;
        _region = region;
        _district = district;
        _population = population;
        _index = index;
        _mobileCode = mobileCode;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void setRegion(String region) {
        _region = region;
    }

    public String getRegion() {
        return _region;
    }

    public void setDistrict(String district) {
        _district = district;
    }

    public String getDistrict() {
        return _district;
    }

    public void setPopulation(int population) {
        _population = population;
    }

    public int getPopulation() {
        return _population;
    }

    public void setIndex(String index) {
        _index = index;
    }

    public String getIndex() {
        return _index;
    }

    public void setMobileCode(String mobileCode) {
        _mobileCode = mobileCode;
    }

    public String getMobileCode() {
        return _mobileCode;
    }

    public void getCity() {
        System.out.println("Name: " + _name);
        System.out.println("Region: " + _region);
        System.out.println("District: " + _district);
        System.out.println("Population: " + _population);
        System.out.println("Index: " + _index);
        System.out.println("Mobile code: " + _mobileCode);
    }

    public void setCity(Scanner ln) {
        System.out.println("Enter name: ");
        _name = ln.nextLine();
        System.out.println("Enter region: ");
        _region = ln.nextLine();
        System.out.println("Enter district: ");
        _district = ln.nextLine();
        System.out.println("Enter population: ");
        _population = ln.nextInt();
        System.out.println("Enter index: ");
        _index = ln.nextLine();
        System.out.println("Enter mobile code: ");
        _mobileCode = ln.nextLine();
        setCity(_name, _region, _district, _population, _index, _mobileCode);
    }
}