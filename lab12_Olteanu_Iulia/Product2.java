package Problema2;

public abstract class Product2 {
    float price;
    String name;

    public Product2(float price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
    abstract float getPriceReduced();
}
