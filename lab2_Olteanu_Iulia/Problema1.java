public class Problema1 {
    public static void main(String args[]) {
        /*
        String s="sir1 si cu sir2 fac un sir3";
        String s1="sir";
        int i=0,nr=0;
        while(i!=-1){
            i=s.indexOf(s1,i);
            if(i!=-1){
                nr++;
                i=i+s1.length();
            }
        }
        System.out.println("Numar de aparitii al lui : "+s1+"> in > " +s+" este "+ nr);

         */
        String s="sir1 si cu sir2 fac un sir3";
        String s1="sir";
        String s2;
        int i,j=0,nr=0;
        i=s1.length();
        while(i<=s.length()){
            s2=s.substring(j,i);
            if(s1.equals(s2))
                nr++;
            i++;
            j++;
        }
        System.out.println("Numar de aparitii al lui : "+s1+"> in > " +s+" este "+ nr);
    }
}
