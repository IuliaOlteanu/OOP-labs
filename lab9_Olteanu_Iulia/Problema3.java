import java.util.ArrayList;

public class Problema3 {
    public static void main(String args[]) {
        IntegerMatrix a = new IntegerMatrix();
        IntegerMatrix b = new IntegerMatrix();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        ArrayList<Integer> l4 = new ArrayList<>();
        ArrayList<Integer> l5 = new ArrayList<>();
        ArrayList<Integer> l6 = new ArrayList<>();


        for(int i = 0; i < 4; i++) {
            l1.add(i * 2);
            l2.add(i * 3);
            l3.add(i * 4);
            l4.add(i * 5);
            l5.add(i * 6);
            l6.add(i * 7);
        }
        a.add(l1);
        a.add(l2);
        a.add(l3);
        System.out.println("Prima matrice : \n" + a);

        b.add(l4);
        b.add(l5);
        b.add(l6);
        System.out.println("A doua matrice : \n" + b);

        System.out.println("Adunarea matricelor : \n" + a.addition(b));

    }
}
