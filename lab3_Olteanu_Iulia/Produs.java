class Produs {
    String nume;
    double pret;
    int cantitate;
    public Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String toString() {
        return " Produs "+nume+" "+pret+" "+cantitate;
    }

    public double getTotalProdus() {
        return cantitate*pret;
    }
}

class Magazin {
    String nume;
    Produs p1,p2,p3;
    Magazin(String nume, Produs p1, Produs p2, Produs p3) {
        this.nume = nume;
        this.p1 = new Produs(p1.nume, p1.pret, p1.cantitate);
        this.p2 = new Produs(p2.nume, p2.pret, p2.cantitate);
        this.p3 = new Produs(p3.nume, p3.pret, p3.cantitate);
    }

    public String toString() {
        return "Magazin: "+ nume +" are produsele urmatoare" + "\n" + p1 + "\n" + p2 + "\n" + p3;
    }

    public double getTotalMagazin() {
        return (p1.getTotalProdus() + p2.getTotalProdus() + p3.getTotalProdus());
    }
}
class Main {
    public static void main(String args[]) {
       Produs p1 = new Produs("caiet",42,2);
       Produs p2 = new Produs("carte",10,4);
       Produs p3 = new Produs("stilou",105,1);
       Magazin m = new Magazin("librarie", p1, p2, p3);
       System.out.println(m);
       System.out.println(m.getTotalMagazin());

    }
}
