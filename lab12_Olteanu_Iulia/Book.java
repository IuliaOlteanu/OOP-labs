package Problema2;

public class Book extends Product2{
    public Book(float price, String name) {
        super(price, name);
    }

    @Override
    float getPriceReduced() {
        return (float) (0.85 * price);
    }
}
