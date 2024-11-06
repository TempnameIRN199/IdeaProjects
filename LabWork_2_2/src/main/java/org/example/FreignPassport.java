package org.example;

public class FreignPassport extends Passport {
    private String _visa;
    private String _passportNumber;

    public FreignPassport(String series, String number, String visa, String passportNumber) {
        super(series, number);
        _visa = visa;
        _passportNumber = passportNumber;
    }

    public void setVisa(String visa) {
        _visa = visa;
    }

    public String getVisa() {
        return _visa;
    }

    public void setPassportNumber(String passportNumber) {
        _passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return _passportNumber;
    }

    public void getForeignPassport() {
        super.getPassport();
        System.out.println("Visa: " + _visa);
        System.out.println("Passport number: " + _passportNumber);
    }
}
