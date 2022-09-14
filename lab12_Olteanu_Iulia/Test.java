package Problema1;

public class Test {
    ShopSingleton shop;

    void addProduct(Product product) {
        if(!shop.products.contains(product))
            shop.products.add(product);
    }

    void removeProduct(Product product) {
        if(shop.products.contains(product))
            shop.products.remove(product);
    }

    Product getCheapestProduct() {
        Product p = shop.products.get(0);
        for(Product aux : shop.products) {
            if(aux.price < p.price)
                p = aux;
        }
        return p;
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.shop = ShopSingleton.getInstance();
        test.shop.name = "Magazin";
        Product p = new Product(56,"faina");
        test.addProduct(new Product(22,"unt"));
        test.addProduct(new Product(13,"oua"));
        test.addProduct(new Product(45,"malai"));
        test.addProduct(p);
        test.shop.showProducts();
        test.removeProduct(p);
        test.shop.showProducts();
        System.out.println("The cheapest item : " + test.getCheapestProduct());

    }
}
