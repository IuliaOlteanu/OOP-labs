import java.util.*;
public class Problema3 {
    public static int aparitii(Vector<Integer> vec,int x){
        int nr=0;
        boolean ok=vec.removeElement(x);
        while(ok){
            nr++;
            ok=vec.removeElement(x);
        }
        return nr;
    }
    public static void main(String args[]){
        Vector<Integer>v=new Vector<Integer>(20);
        int i;
        for(i=0;i<v.capacity();i++){
            Random generator= new Random();
            int nr = generator.nextInt(10);
            v.addElement(nr);
        }
        System.out.println("Vectorul creat random este : "+v);
        System.out.println("Vectorul contine "+ aparitii(v,3)+" elemente egale cu 3");
        System.out.println("Vectorul dupa stergerea tuturor aparitiilor lui 3 : "+v);

        int el_maxim,el_minim,poz_minim,s;
        s=0;
        el_maxim=v.elementAt(0);
        el_minim=el_maxim;
        poz_minim=0;
        for(i=0;i<v.size();i++){
            if(v.elementAt(i)>=el_maxim)
                el_maxim=v.elementAt(i);
            if(v.elementAt(i)<=el_minim){
                poz_minim=i;
                el_minim=v.elementAt(i);
            }
            s=s+v.elementAt(i);
        }
        System.out.println("elementul maxim : "+el_maxim);
        System.out.println("elementul minim este la indicele "+poz_minim);
        System.out.println("media elementelor din vector este "+ (s/v.size()));
    }
}
