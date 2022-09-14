package Problema2;

public class ProductFactory {
    Product2 factory(String type, String nameProduct, float productPrice) {
        if(type.equals("Book")) {
            return new Book(productPrice, nameProduct);
        } else if(type.equals("Food")) {
            return new Food(productPrice, nameProduct);
        } else if(type.equals("Beverage")) {
            return new Beverage(productPrice, nameProduct);
        }
        return new Computer(productPrice, nameProduct);
    }
}
class TestFactory {
    public static void main(String args[]) {
        ProductFactory p = new ProductFactory();
        Book book = (Book) p.factory("Book", "Enigma Otiliei",67);
        System.out.println(book);
        System.out.println(book.name + " after discount is " + book.getPriceReduced());

        Beverage beverage = (Beverage) p.factory("Beverage", "vodka",100);
        System.out.println(beverage);
        System.out.println(beverage.name + " after discount is " + beverage.getPriceReduced());

        Computer computer = (Computer) p.factory("Computer", "macbook",8000);
        System.out.println(computer);
        System.out.println(computer.name + " after discount is " + computer.getPriceReduced());

        Food food = (Food) p.factory("Food", "pizza",35);
        System.out.println(food);
        System.out.println(food.name + " after discount is " + food.getPriceReduced());

    }
}