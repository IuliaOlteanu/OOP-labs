import java.util.ArrayList;
import java.util.Iterator;

public class IntegerMatrix extends AMatrix<Integer> {
    @Override
    public AMatrix<Integer> addition(AMatrix<Integer> m1) {
        IntegerMatrix m2 = new IntegerMatrix();
        Iterator<ArrayList<Integer>> val1 = m1.iterator();
        Iterator<ArrayList<Integer>> val = iterator();
        while(val1.hasNext()) {
            ArrayList<Integer> l = new ArrayList<>();
            Iterator<Integer> val2 = val1.next().iterator();
            Iterator<Integer> vall = val.next().iterator();
            while(val2.hasNext()) {
                Integer nr1 = val2.next();
                Integer nr = vall.next();
                l.add(sum(nr, nr1));
            }
            if(l.size() > 0)
                m2.add(l);

        }
         return m2;
    }

    @Override
    public Integer sum(Integer obj1, Integer obj2) {
        return obj1 + obj2;
    }

    @Override
    public String toString() {
        StringBuffer rez = new StringBuffer();
        for(int i = 0; i < this.size(); i++) {
            for(int j = 0; j < this.get(i).size(); j++)
                rez.append(this.get(i).get(j)).append(" ");
            rez.append("\n");
        }
        return rez.toString();
    }
}
