package Problema1;

import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {

    ArrayList<ArrayMapEntry<K, V>> l = new ArrayList<>();

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return new HashSet<Map.Entry<K, V>>(l);
    }
    public int size() {
        return l.size();
    }
    public V put(K key, V value) {
       l.add(new ArrayMapEntry<>(key, value));
       return value;
    }
    class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        K key;
        V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
           this.value = value;
           return value;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("ArrayMapEntry{");
            sb.append("key=").append(key);
            sb.append(", value=").append(value);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ArrayMapEntry<?, ?> that = (ArrayMapEntry<?, ?>) o;
            return Objects.equals(key, that.key) && Objects.equals(value, that.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}
