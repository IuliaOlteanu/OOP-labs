import java.util.*;
public class Array {
    //Vectorul in care se vor retine elementele
    private Vector vector;

    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }

    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {

        vector.add(x);
    }

    //Metoda care adauga un element in vector, tinand cont de pozitia indicata
    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }

    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {

        return vector.size();
    }

    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {

        return vector.remove(x);
    }

    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {

        return (Integer) vector.remove(pos);
    }

    //Metoda uzitata pentru afisarea unui obiect de tip Array
    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }

    public void sort() {

        Collections.sort(vector);
    }
}

class SortedArray extends Array{
    public SortedArray() {
        super();
    }
    public void addElement(int x) {
        super.addElement(x);
        super.sort();
    }
    public void addElement(int x, int poz) {
        if(poz >= 0 && poz <= super.getSize()) {
            super.addElement(poz, x);
            super.sort();
        }
    }
    public boolean remove(Integer x) {
        return super.remove(x);
    }
    public Integer remove(int pos) {
        return super.remove(pos);
    }

    public String toString() {
        return "SortedArray :  " + super.toString();
    }
}
class MyStack {
    Array vector;
    MyStack() {
        vector = new Array();
    }
    void push(int x) {
        vector.addElement(x);
    }
    /*void Integer pop() {
        return vector.remove(vector.getSize() - 1);
    }*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyStack{");
        sb.append("vector=").append(vector);
        sb.append('}');
        return sb.toString();
    }
}

class Test {
    public static void main(String args[]) {
        SortedArray v = new SortedArray();
        v.addElement(2);
        v.addElement(1);
        v.addElement(7);
        System.out.println(v);
    }

}

