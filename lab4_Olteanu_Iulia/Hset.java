import java.util.Hashtable;

class HSet extends Hashtable {
     HSet() {
         super();
    }

    public boolean add(Object value) {
        if(contains(value))
            return false;
        super.put(value,value);
        return true;
    }

    public String toString() {
        return "HSet: "+"\n" + super.values();
    }

    public Object remove(Object key) {
        if(containsKey(key))
            return super.remove(key);
        return key;
    }
}

class Test3 {
    public static void main(String args[]) {
        HSet set = new HSet();
        set.add("Laborator");
        set.add("Agregare");
        set.add("Mostenire");
        System.out.println(set);
        System.out.println(set.size());
        set.add("Laborator");
        if(set.size() == 4) {
            System.out.println("Multimea nu trebuie sa contina duplicate!");
        }
        System.out.println(set.remove("POO"));
        System.out.println(set.remove("Laborator"));
        if(set.size() != 2) {
            System.out.println("Stergerea nu functioneaza!");
        }
        set.add("Supradefinire");
        set.add("Supraincarcare");
        System.out.println(set);
    }
}

