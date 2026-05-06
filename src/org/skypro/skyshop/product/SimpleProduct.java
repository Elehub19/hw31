package org.skypro.skyshop.product;

public class SimpleProduct extends Product{
    public double price;

    public  SimpleProduct(String name, int price)
    {
        super(name, price);
    }
    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
}
