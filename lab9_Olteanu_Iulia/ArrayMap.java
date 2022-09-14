import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    Vector<K> keys = new Vector<>();
    Vector<V> value = new Vector<>();

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        for (int i = 0; i < keys.size(); i++) {
            set.add(new ArrayMapEntry(keys.get(i), value.get(i)));
        }
        return set;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArrayMap : \n");
        for(int i = 0; i < keys.size(); i++)
            sb.append(keys.get(i) + " -> " + value.get(i) + "\n");
        return sb.toString();
    }
    

    @Override
    public Set<K> keySet() {
        return new HashSet<K>(keys);
    }

    @Override
    public Collection<V> values() {
        return new HashSet<V>(value);
    }

    class ArrayMapEntry implements Map.Entry<K, V> {
        K key;
        V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString() {
            return key + " -> " + value ;
        }
    }
}
class Test {
    public static void main (String args[]) {
        ArrayMap<Integer, String> map = new ArrayMap<>();

        System.out.println("Populam colectia...");
        map.put(7, "Colectii si genericitate");
        map.put(8, "Clase interne");
        map.put(5, "Fluxuri");

        System.out.println("Verificam...");
        System.out.println("Continutul colectiei: " + map);

        System.out.println("Continutul colectiei: ");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> e : entries) {
            System.out.println(e + " ");
        }
        System.out.println();
    }
}