package zad3;


public class PointC {
    private int x;
    private int y;

    public PointC(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "PointC{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
