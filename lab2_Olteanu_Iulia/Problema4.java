import java.util.*;
public class Problema4 {
    public static void main(String args[]) {
        Vector<Integer> v1=new Vector<Integer>(11);
        Vector<Integer> v2=new Vector<Integer>(11);

        int i, j;
        for (i = 0; i < 11; i++) {
            v1.addElement(3 * i);
            v2.addElement(2 * i);
        }
        System.out.println("Vectorul 1 : " + v1);
        System.out.println("Vectorul 2 : " + v2);

        //intersectie

        Vector<Integer> v3=new Vector<>();
        for(i=0;i<11;i++){
            int el=v1.elementAt(i);
            boolean gasit=v2.contains(el);
            if(gasit)
                v3.addElement(el);
        }
        System.out.println("Vector dupa intersectie : "+v3);

        //reuniune

        Vector<Integer> v4=new Vector<>();
        for(i=0;i<11;i++) {
            int el=v1.elementAt(i);
            v4.addElement(el);
        }
        for(i=0;i<11;i++){
            int el=v2.elementAt(i);
            boolean gasit=v4.contains(el);
            if(!gasit)
                v4.addElement(el);
        }
        System.out.println("Vector dupa reuniune : "+v4);

        //diferenta

        Vector<Integer> v5=new Vector<>();
        for(i=0;i<11;i++){
            int el=v1.elementAt(i);
            boolean gasit=v2.contains(el);
            if(!gasit)
                v5.addElement(el);
        }
        System.out.println("Vector dupa diferenta dintre prima multime si a doua : "+v5);
    }
}
