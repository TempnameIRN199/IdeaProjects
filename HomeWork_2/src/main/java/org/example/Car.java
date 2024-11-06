package org.example;

public class Car {
    // Реалізуйте клас “Автомобіль”. Необхідно зберігати у полях класу: назва автомобіля, назва виробника, рік
    //випуску, об’єм двигуна. Реалізуйте конструктори і методи класу для вводу даних, виводу даних,
    //реалізуйте доступ до окремих полів через методи класу. Використайте механізм перевантаження методів

    private String _name;
    private String _manufacturer;
    private int _year;
    private double _engineVolume;

    public Car() {
        _name = "";
        _manufacturer = "";
        _year = 0;
        _engineVolume = 0;
    }

    public void setCar(String name, String manufacturer, int year, double engineVolume) {
        _name = name;
        _manufacturer = manufacturer;
        _year = year;
        _engineVolume = engineVolume;
    }

    public void _setCar(String name, String manufacturer, int year, double engineVolume) {
        setCar(name, manufacturer, year, engineVolume);
    }

    public void _setName(String name) {
        _name = name;
    }

    public String _getName() {
        return _name;
    }

    public void _setManufacturer(String manufacturer) {
        _manufacturer = manufacturer;
    }

    public String _getManufacturer() {
        return _manufacturer;
    }

    public void _setYear(int year) {
        _year = year;
    }

    public int _getYear() {
        return _year;
    }

    public void _setEngineVolume(double engineVolume) {
        _engineVolume = engineVolume;
    }

    public double _getEngineVolume() {
        return _engineVolume;
    }
}