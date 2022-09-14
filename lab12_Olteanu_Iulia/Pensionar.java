package Problema4;

public class Pensionar {
    int aniVechime;
    float salariu;
    Strategy strategy;

    public Pensionar(int aniVechime, float salariu) {
        this.aniVechime = aniVechime;
        this.salariu = salariu;
    }

    float getPensie() {
        if(20 <= aniVechime && aniVechime < 30) {
            strategy = new TwentyStrategy();
            return strategy.calcul(aniVechime, salariu);
        }else if(30 <= aniVechime && aniVechime < 40) {
            strategy = new ThirtyStrategy();
            return strategy.calcul(aniVechime, salariu);
        }
        strategy = new FortyStrategy();
        return strategy.calcul(aniVechime, salariu);
    }

    @Override
    public String toString() {
        return "Pensionar{" + "aniVechime=" + aniVechime +
                ", salariu=" + salariu +
                '}';
    }
}

class TestStrategy {
    public static void main(String[] args) {
        Pensionar pensionar = new Pensionar(34,8000);
        System.out.println("pensia dupa " + pensionar.aniVechime + " ani vechime este " + pensionar.getPensie());
        Pensionar pensionar1 = new Pensionar(24,9000);
        System.out.println("pensia dupa "+ pensionar1.aniVechime + " ani vechime este " + pensionar1.getPensie());

        Pensionar pensionar2 = new Pensionar(44,70000);
        System.out.println("pensia dupa "+ pensionar2.aniVechime + " ani vechime este " + pensionar2.getPensie());
    }
}