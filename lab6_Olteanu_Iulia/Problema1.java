import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

abstract class Shape {
    String color;
    boolean filled;

    public Shape() {

        this("roz",true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape {
    double radius;
    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("color='").append(color).append('\'');
        sb.append(", filled=").append(filled);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle() {
        super();
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("color='").append(color).append('\'');
        sb.append(", filled=").append(filled);
        sb.append(", width=").append(width);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(String color, boolean filled , double side) {
        super(color,filled,side, side);
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        width = side;
        length = side;
    }
    public void setWidth(double side) {
        width = side;
    }
    public void setLength(double side) {
        length = side;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("color='").append(color).append('\'');
        sb.append(", filled=").append(filled);
        sb.append(", width=").append(width);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }

    public double getArea() {
        return length*length;
    }
    public double getPerimeter(){
        return 4*length;
    }
}

public class Problema1 {
    public static void main(String args[]) {
        boolean ok = true;
        //Verificarea relatiilor de mostenire
        Shape obj1;
        obj1 = new Square();
        obj1 = new Rectangle();
        obj1 = new Circle();
        Rectangle obj3 = new Square();
        //Verificarea constructorilor
        Constructor[] allConstructors = Square.class.getDeclaredConstructors();
        if(allConstructors.length != 3) {
            System.out.println("Clasa Square NU are definiti toti constructorii!");
            ok = false;
        }
        Circle circle = new Circle("green", true, 2.0);
        Square square = new Square("black", true, 5.0);
        if(!Modifier.isAbstract(Shape.class.getModifiers())) {
            System.out.println("Clasa Shape NU este abstracta!");
            ok = false;
        }
        if(!Shape.class.isAssignableFrom(Square.class) && !Rectangle.class.isAssignableFrom(Square.class)) {
            System.out.println("Clasele NU respecta relatia de mostenire descrisa!");
            ok = false;
        }
        if(!circle.isFilled() || !circle.getColor().equals("green")) {
            System.out.println("Constructorul din clasa Circle NU este definit conform specificatiilor!");
            ok = false;
        } else if(!square.isFilled() || !square.getColor().equals("black") || square.getWidth() != square.getLength()) {
            System.out.println("Constructorul din clasa Square NU este definit conform specificatiilor!");
            ok = false;
        } else if(ok){
            System.out.println("Au trecut toate testele!");
        }
    }

}