Problema 1
Pornind de la codul de mai jos, asigurați faptul că se va apela codul aferent tipului dinamic al parametrului, definind clasele Hero, Warrior, Ninja, Rogue și StormFire, în mod minimal!

public class Binding{
    public static void main(String args[]) {
        Hero h1 = new Warrior(), h2 = new Ninja();
        Hero h3 = new Rogue();
        BadLuck bl = new StormFire();
        bl.execute(h1);
        bl.execute(h2);
        bl.execute(h3);
    }
}
 
abstract class BadLuck {
    abstract void execute(Hero h);
    abstract void execute(Warrior w);
    abstract void execute(Ninja n);
    abstract void execute(Rogue r);
}

Problema 2
Să se definească o clasă generica ArrayMap, pentru un dicționar realizat din doi vectori (un vector de chei și un vector de valori asociate, obiecte din clasa Vector), care să poată înlocui o clasă HashMap sau TreeMap. Astfel, această clasă va extinde clasa AbstractMap, suprascriind următoarele metode:

public String toString();
public V put(K, V);
public V get(Object );
public Set<K> keySet();
public Collection<V> values();
public Set<Map.Entry<K, V>> entrySet(); // atentie! Se va defini o clasa interna pentru o intrare in dictionar 

Problema 3
Pornind de la clasa abstractă AMatrix, pusă la dispoziție în arhiva laboratorului, implementați clasa IntegerMatrix care moștenește această clasă abstractă și modelează un tablou bidimensional cu numere întregi. Clasa AMatrix moștenește clasa ArrayList. Astfel, matricea propriu-zisă este un obiect de tip ArrayList care conține elemente de tip ArrayList. Clasa va conține metode pentru următoarele operații: afișarea matricei, adunarea a două matrice, și metoda sum pentru a aduna două elemente!.

//afisare
public String toString();
//sum
public Integer sum(Integer obj1, Integer obj2) 
//adunare
public AMatrix addition(AMatrix m);

