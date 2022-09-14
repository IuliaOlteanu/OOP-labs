public class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater {
    public Paralelogram(int latura1, int latura2, double unghi1, double unghi2) {
        super(latura1, latura2, latura1, latura2, unghi1, unghi2, unghi1, unghi2);
    }
    double arie_paralelogram(int latura1, int latura2, int unghi1) {
        return  (latura1*latura2*Math.sin(Math.toRadians(unghi1)));
    }
}

class Romb extends Paralelogram {
    int diag1,diag2;
    public Romb(int latura1, int diag1, int diag2, double unghi1, double unghi2) {
        super(latura1, latura1, unghi1, unghi2);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }
    public int arie_romb(int diag1, int diag2) {

        return (diag1*diag2)/2;
    }
}

class Dreptunghi extends Paralelogram {
    public Dreptunghi(int latura1, int latura2) {

        super(latura1, latura2,90,90);
    }
    public int arie_dreptunghi(int latura1, int latura2) {

        return latura1*latura2;
    }
}

class Patrat extends Dreptunghi {
    public Patrat(int latura1) {

        super(latura1,latura1);
    }
    public int arie_patrat(int latura1) {

        return arie_dreptunghi(latura1, latura1);
    }
}
class Main {
    public static void main(String args[]) {
        Patrulater fig1 = new Patrulater(1,2,3,4,30,150,120,60);
        System.out.println("Patrulaterul are perimetrul : " + fig1.perimetru());

        Paralelogram fig2 = new Paralelogram(3,8,120,60);
        System.out.println("Aria paralelogramului este : " + fig2.arie_paralelogram(3,6,120));

        Romb fig3 = new Romb(6,2,8,60,120);
        System.out.println("Aria rombului este : " + fig3.arie_romb(2,8));

        Dreptunghi fig4 = new Dreptunghi(10,22);
        System.out.println("Aria dreptunghiului este : " + fig4.arie_dreptunghi(10,22));

        Patrat fig5 =new Patrat(14);
        System.out.println("Aria patratului este : " + fig5.arie_patrat(14));
        System.out.println("Perimetrul patratului este : " + fig5.perimetru());
    }
}
