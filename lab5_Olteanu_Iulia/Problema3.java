import java.util.*;
class NumarNegativ extends Exception {
    public NumarNegativ(String mesaj) {
        super(mesaj);
    }
}
public class Problema3 {
    Vector<Integer> v = new Vector<Integer>();
    public void myRead() throws NumarNegativ {
        Scanner el = new Scanner(System.in);
        int nr = el.nextInt();
        if (nr < 0)
            throw new NumarNegativ("Numarul introdus este negativ!");
        while(nr >= 0) {
            v.addElement(nr);
            nr = el.nextInt();
            if (nr < 0)
                throw new NumarNegativ("Numarul introdus este negativ!");
        }
    }
    public static void main(String args[])  {
        Problema3 el = new Problema3();
        try {
            el.myRead();
        } catch (NumarNegativ e) {
            e.printStackTrace();
            System.out.println("Adauga doar numere pozitive");
        }
        System.out.println("elementul maxim din vector este : " + Collections.max(el.v));

    }
}
