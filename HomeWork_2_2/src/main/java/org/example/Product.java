package org.example;

public class Product extends Money{
    private final String name;
    private int price;

    public Product(String name, int dollars, int cents) {
        super(dollars, cents);
        this.name = name;
        this.price = dollars * 100 + cents;
    }

    public void reducePrice(int amount) {
        price -= amount;
        setDollars(price / 100);
        setCents(price % 100);
    }

    public void printProduct() {
        System.out.println("Product: " + name + ", price: " + getDollars() + "." + getCents());
    }
}
