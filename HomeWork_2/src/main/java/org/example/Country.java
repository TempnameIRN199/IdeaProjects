package org.example;

import java.util.Scanner;

public class Country
{
    private String _name;
    private String _nameContinent;
    private int _population;
    private String _mobileCode;
    private String _capital;
    private String[] _cities;

    public Country()
    {
        _name = "";
        _nameContinent = "";
        _population = 0;
        _mobileCode = "";
        _capital = "";
        _cities = new String[0];
    }

    public void setCountry(String name, String nameContinent, int population, String mobileCode, String capital, String[] cities) {
        _name = name;
        _nameContinent = nameContinent;
        _population = population;
        _mobileCode = mobileCode;
        _capital = capital;
        _cities = cities;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void setNameContinent(String nameContinent) {
        _nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return _nameContinent;
    }

    public void setCapital(String capital) {
        _capital = capital;
    }

    public String getCapital() {
        return _capital;
    }

    public void setPopulation(int population) {
        _population = population;
    }

    public int getPopulation() {
        return _population;
    }

    public void setMobileCode(String mobileCode) {
        _mobileCode = mobileCode;
    }

    public String getMobileCode() {
        return _mobileCode;
    }

    public void setCities(String[] cities) {
        _cities = cities;
    }

    public String[] getCities() {
        return _cities;
    }

    // Реалізуйте методи класу для
    //вводу даних, виводу даних, реалізуйте доступ до окремих полів через методи класу.

    public void printCountry() {
        System.out.println("Country: " + _name);
        System.out.println("Continent: " + _nameContinent);
        System.out.println("Population: " + _population);
        System.out.println("Mobile code: " + _mobileCode);
        System.out.println("Capital: " + _capital);
        System.out.println("Cities: ");
        for (String city : _cities) {
            System.out.println(city);
        }
    }

    public void inputCountry(Scanner ln) {
        System.out.print("Enter country name: ");
        _name = ln.nextLine();
        System.out.print("Enter continent name: ");
        _nameContinent = ln.nextLine();
        System.out.print("Enter population: ");
        _population = ln.nextInt();
        ln.nextLine();
        System.out.print("Enter mobile code: ");
        _mobileCode = ln.nextLine();
        System.out.print("Enter capital: ");
        _capital = ln.nextLine();
        System.out.print("Enter count of cities: ");
        int n = ln.nextInt();
        ln.nextLine();
        _cities = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            _cities[i] = ln.nextLine();
        }
        setCountry(_name, _nameContinent, _population, _mobileCode, _capital, _cities);
    }
}
