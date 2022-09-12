public class Problema6 {
    public static void main(String[] args) {
        Problema6 obiect = new Problema6();
        for (int i=0; i<20;i++) {
            System.out.print(i + " : ");
            if (obiect.prim(i))
                System.out.println("este  numar prim");
            else System.out.println("nu este numar prim");
        }
    }

    boolean prim(int nr) {
        if (nr<2)
            return false;
        if (nr==2)
            return true;
        for (int i=2; i<= Math.sqrt(nr);i++)
            if (nr%i==0)
                return false;
        return true;
    }
}