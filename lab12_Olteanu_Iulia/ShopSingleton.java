package Problema1;

import java.util.ArrayList;
import java.util.List;

public class ShopSingleton {
    String name;
    List<Product> products = new ArrayList<>();
    private static ShopSingleton instance = null;
    public static ShopSingleton getInstance() {
        if(instance == null)
            instance = new ShopSingleton();
        return instance;
    }

    void showProducts() {
        System.out.println(name);
        for(Product product : products)
            System.out.println(product);
    }
}

