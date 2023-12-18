package zad3;

public class Conversion {

    public static PointC toPointC(PointR pointR) {
        return new PointC(pointR.x(), pointR.y());
    }

    public static PointR toPointR(PointC pointC) {
        return new PointR(pointC.getX(), pointC.getY());
    }
}
