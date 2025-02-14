package org.example;

public class Book
{
    private String _name;
    private String _author;
    private String _year;
    private String _publisher;
    private String _genre;
    private int _pages;

    public Book() {
        _name = "";
        _author = "";
        _year = "";
        _publisher = "";
        _genre = "";
        _pages = 0;
    }

    public void setBook(String name, String author, String year, String publisher, String genre, int pages) {
        _name = name;
        _author = author;
        _year = year;
        _publisher = publisher;
        _genre = genre;
        _pages = pages;
    }

    public void _setBook(String name, String author, String year, String publisher, String genre, int pages) {
        setBook(name, author, year, publisher, genre, pages);
    }

    public void _setName(String name) {
        _name = name;
    }

    public String _getName() {
        return _name;
    }

    public void _setAuthor(String author) {
        _author = author;
    }

    public String _getAuthor() {
        return _author;
    }

    public void _setYear(String year) {
        _year = year;
    }

    public String _getYear() {
        return _year;
    }

    public void _setPublisher(String publisher) {
        _publisher = publisher;
    }

    public String _getPublisher() {
        return _publisher;
    }

    public void _setGenre(String genre) {
        _genre = genre;
    }

    public String _getGenre() {
        return _genre;
    }

    public void _setPages(int pages) {
        _pages = pages;
    }

    public int _getPages() {
        return _pages;
    }
}
