public class Problema2 {
    static int nr_ap(String s,String cuv){
        int nr=0,i;
        String s1[]=s.split(" ");
        for(i=0;i<s1.length;i++){
            if(cuv.equals(s1[i]))
                nr++;
        }
        return nr;
    }
    public static void main(String args[]){
        String s1="sir1 si sir2 sunt 2 siruri";
        String s2="sir1";
        System.out.println("Nr de aparitii:"+nr_ap(s1,s2));
    }
}
