public class Problema2 {
    public static void main(String args[]) {
        Rectangle o1 = new Rectangle();
        Square o2 = new Square();
        Circle c1 = new Circle();
        Square sq;
        Rectangle r = new Square(6);
        sq = (Square) r;
        sq = new Square(12);
        r = sq;
        System.out.println(r.getLength());
    }
}
