
public class Warrior {
    public static final int SNAKE_Warrior = 0;
    public static final int OGRE_Warrior = 1;
    public static final int MARSHMALLOW_MAN_Warrior = 2;

    //Stores one of the three above types
    //0 = dead, 100 = full strength
    public int health;
    public String name;

    public Warrior ( int health, String name) {
        this.health = health;
        this.name = name;
    }
    public Warrior(){
        this(0," ");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Warrior{");
        sb.append("health=").append(health);
        sb.append(", name='").append(name).append('\'');
        sb.append("}\n");
        return sb.toString();
    }
}
