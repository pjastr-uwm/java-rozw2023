package zad3;

public class Test {

    public static void main(String[] args) {
        PointR pointR = new PointR(1, 2);
        PointC pointC = new PointC(3, 4);
        System.out.println("pointR = " + pointR);
        System.out.println("pointC = " + pointC);
        System.out.println("Conversion.toPointC(pointR) = " + Conversion.toPointC(pointR));
        System.out.println("Conversion.toPointR(pointC) = " + Conversion.toPointR(pointC));
        System.out.println(pointR.equals(Conversion.toPointR(Conversion.toPointC(pointR))));
        System.out.println(pointC.equals(Conversion.toPointC(Conversion.toPointR(pointC))));
    }
}
