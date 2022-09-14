import java.util.Vector;

public class WarriorPack extends Warrior {
    public Vector warriors ;

    public WarriorPack() {

       warriors = new Vector();
    }

    public void addWarrior(Warrior newWarrior) {

        warriors.add(newWarrior);
    }

    public Vector getWarriors() {

        return warriors ;
    }
    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
            if (warriors.get(i).getClass() == SNAKE.class) {
                //Snake does 10 damage
                damage += ((SNAKE)warriors.get(i)).getGetDamage();
            } else if (warriors.get(i).getClass() == OGRE.class) {
                //Ogre does 6 damage
                damage += ((OGRE)warriors.get(i)).getGetDamage() ;
            } else if (warriors.get(i).getClass() == MARSHMALLOW_MAN.class) {
                //Marshmallow Man does 1 damage
                damage += ((MARSHMALLOW_MAN)warriors.get(i)).getGetDamage();
            }
        }
        return damage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WarriorPack:\n");
        sb.append("warriors:\n").append(warriors);
        sb.append("\n");
        return sb.toString();
    }
}
class SNAKE extends Warrior{
    public SNAKE() {
        this(0,"Snake");
    }

    public SNAKE(int health, String name) {
        super(health, name);
    }

    public int getGetDamage() {
        return 10;
    }
}

class OGRE extends Warrior {
    public OGRE() {
        this(12,"Ogre");
    }
    public OGRE(int health, String name) {
        super(health, name);
    }
    public int getGetDamage() {
        return 6;
    }
}
class MARSHMALLOW_MAN extends Warrior {
    public MARSHMALLOW_MAN() {
        this(16,"Mashmallow_man");
    }
    public MARSHMALLOW_MAN(int health, String name) {
        super(health, name);
    }
    public int getGetDamage() {
        return 1;
    }
}
class Test_p4 {
    public static void main(String args[]) {
        Warrior w1 = new SNAKE(15,"warrior1");
        Warrior w2 = new OGRE(20, "warrior2");
        Warrior w3 = new MARSHMALLOW_MAN(30,"warrior3");

        WarriorPack pack = new WarriorPack();
        pack.addWarrior(w1);
        pack.addWarrior(w2);
        pack.addWarrior(w3);

        System.out.println("Daune produse de grupul de razboinici:" + pack.calculateDamage());
        System.out.println("Afisare grup de razboinici : " + pack);
    }
}
