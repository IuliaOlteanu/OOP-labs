public class Punct {
    private int x;
    private int y;

    Punct() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "( "+x+", "+y+" )";
    }

    //distanta intre 2 pct:sqrt((x2-x1)^2+(y2-y1)^2)
    public double distance(int x,int y) {
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }

    public double distance(Punct p1) {
        return distance(p1.getX(), p1.getY());
    }
}