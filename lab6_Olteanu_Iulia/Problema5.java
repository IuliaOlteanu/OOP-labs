import java.util.Vector;

abstract class Vagon {
    int persoane;
    int colete;

    public Vagon(int persoane, int colete) {
        this.persoane = persoane;
        this.colete = colete;
    }

    public int getPersoane() {
        return persoane;
    }

    public void setPersoane(int persoane) {
        this.persoane = persoane;
    }

    public int getColete() {
        return colete;
    }

    public void setColete(int colete) {
        this.colete = colete;
    }

    public abstract void inchidereUsi();
    public abstract void deschidereUsi();
    public abstract void blocareGeamuri();
}
class CalatoriA extends Vagon {
    public CalatoriA(int persoane, int colete) {
        super(persoane, colete);
    }
    public CalatoriA() {
        super(40, 300);
    }

    @Override
    public void inchidereUsi() {
        System.out.println("In CalatoriA usile se inchid automat");
    }

    @Override
    public void deschidereUsi() {
        System.out.println("In CalatoriA usile se deschid automat");
    }

    @Override
    public void blocareGeamuri() {
        System.out.println("In CalatoriA geamurile nu se blocheaza automat");
    }
}

class CalatoriB extends Vagon {
    public CalatoriB(int persoane, int colete) {
        super(persoane, colete);
    }

    public CalatoriB() {
        super(50,400);
    }

    @Override
    public void inchidereUsi() {
        System.out.println("In CalatoriB usile se inchid automat");
    }

    @Override
    public void deschidereUsi() {
        System.out.println("In CalatoriB usile se deschid automat");
    }

    @Override
    public void blocareGeamuri() {
        System.out.println("In CalatoriB geamurile se blocheaza automat");

    }
}

class Marfa extends Vagon {
    public Marfa(int persoane, int colete) {
        super(persoane, colete);
    }

    public Marfa() {
        super(0,400);
    }

    @Override
    public void inchidereUsi() {
        System.out.println("In Marfa usile se inchid manual");
    }

    @Override
    public void deschidereUsi() {
        System.out.println("In Marfa usile se deschid manual");
    }

    @Override
    public void blocareGeamuri() {
        System.out.println("In Marfa geamurile se blocheaza manual");
    }
}

class Tren implements Comparable {
    Vector<Vagon> v;
    public Tren() {
        this(new Vector<Vagon>());
    }
    public Tren(Vector<Vagon> v) {
        this.v = v;
    }

    public Vector<Vagon> getV() {
        return v;
    }

    public void setV(Vector<Vagon> v) {
        this.v = v;
    }
    public void addVagon(Vagon v) {
        this.v.add(v);
    }
    public int nr_colete() {
        int s = 0;
        for(int i = 0; i < v.size(); i++)
            s = s + v.get(i).getColete();
        return s;
    }
    public int compareTo(Object obj) {
        Tren t = (Tren) obj;
        return (t.nr_colete() - this.nr_colete());
    }
}
public class Problema5 {
    public static void main(String args[]) {
        Tren t = new Tren();
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriB());
        t.addVagon(new Marfa());
        for(int i = 0; i < t.v.size(); i++)
            System.out.println(t.v.get(i).getPersoane() + t.v.get(i).getColete() + t.v.get(i).getColete());
    }

}
