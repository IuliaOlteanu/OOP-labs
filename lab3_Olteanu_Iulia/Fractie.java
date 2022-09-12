public class Fractie {
    int numarator,numitor;
    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }
    public Fractie() {
        this(0,1);
    }
    public Fractie suma(Fractie f) {
        if(f.numitor == numitor)
            return new Fractie(f.numarator+numarator,numitor);
        else{
            return new Fractie(f.numarator*numitor+f.numitor*numarator,f.numitor*numitor);
        }
    }
    public String toString() {
        if(numitor == 0)
            return "imposibil, fractie cu numitor zero";
        else if(numitor > 0)
            return numarator+"/"+numitor;
        return (-numarator)+"/"+(-numitor);
    }
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(!(obj instanceof Fractie))
            return false;
        Fractie f=(Fractie) obj;
        return (f.numitor==numitor && f.numarator==numarator);
    }
    public static void main(String args[]) {
        Fractie f1 = new Fractie(3,5);
        Fractie f2 = new Fractie(1,7);
        Fractie s = new Fractie();
        s = f1.suma(f2);
        System.out.println(f2);
        System.out.println(s);
        System.out.println(f1.equals(f2));

    }
}
