import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class Problema4 {
    public TreeMap gasire(String name) {
        TreeMap<String, LinkedList<Integer>> tm = new TreeMap<>();
        try {
            RandomAccessFile f = new RandomAccessFile("D:\\Facultate\\ANUL 2\\SEM1-Iulia\\Programare Orientata pe Obiecte\\lab7\\" + name, "r");
            int linie = 1;
            String l = null;
            while ((l = f.readLine()) != null) {
                ///String data = el.next();
                String cuv[] = l.split("[^a-zA-Z0-9']+");
                for(String i : cuv) {
                    if(tm.containsKey(i)) {
                        ((LinkedList)tm.get(i)).add(linie);

                    } else {
                        LinkedList list = new LinkedList();
                        list.add(linie);
                        tm.put(i, list);
                    }
                }
                linie++;
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Eroare!!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Eroare!!!!");
            e.printStackTrace();
        }
        return tm;
    }
    public static void main(String args[]) {
        Problema4 obj = new Problema4();
        TreeMap tm = obj.gasire("test01.txt");
        TreeMap<String, LinkedList<Integer>> map = new TreeMap<>();
        map = tm;
        for(Map.Entry<String, LinkedList<Integer>> entry:map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print("{");
            for(Iterator i = entry.getValue().iterator(); i.hasNext();) {
                System.out.print(i.next() + " ");
            }
            System.out.print("}");
        }

    }
}
