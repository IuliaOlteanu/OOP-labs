public class problema5 {

    public int putere(int a,int b){
        if(b==0)
            return 1;
        else if(b==1)
            return a;
        else
            return a*putere(a,b-1);
    }

    void afisare(int x){
        System.out.println(x);
    }

    public static void main(String args[]){
        problema5 obiect=new problema5();
        int rez= obiect.putere(2,4);
        obiect.afisare(rez);
        obiect.afisare((int) Math.pow(2,4));
    }
}
