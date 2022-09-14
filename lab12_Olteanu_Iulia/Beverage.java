package Problema2;

public class Beverage extends Product2 {
    public Beverage(float price, String name) {
        super(price, name);
    }

    @Override
    float getPriceReduced() {
        return (float) (0.95 * price);
    }
}
