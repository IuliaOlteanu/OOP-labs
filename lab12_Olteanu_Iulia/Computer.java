package Problema2;

public class Computer extends Product2{
    public Computer(float price, String name) {
        super(price, name);
    }

    @Override
    float getPriceReduced() {
        return (float) 0.90 * price;
    }
}
