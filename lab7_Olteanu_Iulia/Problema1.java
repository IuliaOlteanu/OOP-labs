import java.io.*;
import java.util.*;

public class Problema1 {

    public TreeSet printWords (String name) {
        TreeSet ts1 = new TreeSet();

        try {
            File f = new File("D:\\Facultate\\ANUL 2\\SEM1-Iulia\\Programare Orientata pe Obiecte\\lab7\\" + name);
            Scanner el = new Scanner(f);
            while (el.hasNext()) {
                String data = el.next();
                String cuv[] = data.split("[^a-zA-Z0-9']+");
                for(String i : cuv)
                    ts1.add(i);
            }
            el.close();
        } catch (FileNotFoundException e) {
            System.out.println("Eroare!!!");
            e.printStackTrace();
        }
        return ts1;
    }

    public TreeSet prinWordsComparator (TreeSet tr) {
        TreeSet ts2 = new TreeSet(new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) < 0) {
                    return 1;
                } else if (o1.compareTo(o2) > 0){
                    return -1;
                }
                return 0;
            }
            public boolean equals(Object obj) {
                return obj == this;
            }
        });

        for (Object ob : tr) {
            ts2.add(ob);
        }
        return ts2;
    }

    public static void main(String[] args) {
        Problema1 obj = new Problema1();
        TreeSet ts1 = obj.printWords("test01.txt");
        TreeSet ts2 = obj.prinWordsComparator(ts1);

        System.out.println("Primul tree###########################################################################");
        for (Object ob : ts1) {
            System.out.println((String) ob);
        }

        System.out.println("Al doilea tree##########################################################################");

        for (Object ob : ts2) {
            System.out.println((String) ob);
        }

    }
}
