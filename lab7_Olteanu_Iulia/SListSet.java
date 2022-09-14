import java.io.File;
import java.io.IOException;
import java.util.*;

public class SListSet extends LinkedList implements SortedSet {
    Comparator comparator;

    public SListSet(Comparator comparator) {
        super();
        this.comparator = comparator;
    }
    public SListSet() {
        super();
        comparator = null;
    }
    public boolean add(Object obj) {
        if (!this.contains(obj)) {
            super.add(obj);
            this.sort(comparator());
            return true;
        }
        return false;
    }
    @Override
    public Comparator comparator() {
        return comparator;
    }

    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        SListSet s = new SListSet();
        int start, stop;
        start = super.indexOf(fromElement);
        stop = super.indexOf(toElement);
        for(int i = start; i <= stop; i++) {
            s.add(super.get(i));
        }
        return s;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        SListSet s = new SListSet();
        int stop;
        stop = super.indexOf(toElement);
        for(int i = 0; i <= stop; i++) {
            s.add(super.get(i));
        }
        return s;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        SListSet s = new SListSet();
        int start;
        start = super.indexOf(fromElement);
        for(int i = start; i <= size(); i++) {
            s.add(super.get(i));
        }
        return s;
    }

    @Override
    public Object first() {
        return super.getFirst();
    }

    @Override
    public Object last() {
        return super.getLast();
    }
}

class Test3 {
    public static void main(String args[]) {
        SListSet ls1 = new SListSet();
        SListSet ls2 = new SListSet(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) < 0) {
                    return 1;
                } else if (o1.compareTo(o2) > 0){
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return obj == this;
            }
        });

        try {
            File f = new File("D:\\Facultate\\ANUL 2\\SEM1-Iulia\\Programare Orientata pe Obiecte\\lab7\\test01.txt\\" );
            Scanner myReader = new Scanner(f);
            while (myReader.hasNext()) {
                String data = myReader.next();
                String cuv[] = data.split("[^a-zA-Z0-9']+");
                for(String i : cuv) {
                    ls1.add(i);
                    ls2.add(i);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Primul tree###########################################################################");
        for (Object ob : ls1) {
            System.out.println((String) ob);
        }

        System.out.println("Al doilea tree##########################################################################");

        for (Object ob : ls2) {
            System.out.println((String) ob);
        }
    }
}