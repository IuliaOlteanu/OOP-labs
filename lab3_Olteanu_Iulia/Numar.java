public class Numar {
    int a;
    Numar(int a) {
        this.a = a;
    }

    public int suma(int a) {
        return this.a+a;
    }

    public int suma(int a, int b) {
        return suma(a)+b;
    }

    public int suma(int a, int b, int c) {
        return suma(a,b)+c;
    }

    public int suma(int a, int b, int c, int d) {
        return suma(a,b,c)+d;
    }

    public static void main(String args[]) {
        Numar a = new Numar(12);
        Numar b = new Numar(23);
        System.out.println(a.suma(3));
        System.out.println(a.suma(1,2,3,4));
    }
}
