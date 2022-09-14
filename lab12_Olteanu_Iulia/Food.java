package Problema2;

public class Food extends Product2 {
    public Food(float price, String name) {
        super(price, name);
    }

    @Override
    float getPriceReduced() {
        return (float) (0.80 * price);
    }
}
