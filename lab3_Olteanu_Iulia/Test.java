public class Test {
    public static void main(String args[]) {
        Punct p1 = new Punct();
        p1.setX(1);
        p1.setY(2);
        Punct p2 = new Punct();
        p2.setX(-1);
        p2.setY(3);
        System.out.println("distanta dintre cele 2 puncte este "+p1.distance(p2));
    }
}
