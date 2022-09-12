public class Problema7 {

    public static void main(String args[]){
        int i,n=100;
        Problema7 obiect=new Problema7();
        for(i=1;i<n/2;i++){
            if(obiect.prim(i) && obiect.prim(n-i))
                System.out.println(n+"="+i+"+"+(n-i));
        }
    }

    boolean prim(int nr) {
        if (nr==1)
            return true;
        if (nr==2)
            return true;
        for (int i=2; i<=Math.sqrt(nr);i++)
            if (nr%i==0)
                return false;
        return true;
    }
}
